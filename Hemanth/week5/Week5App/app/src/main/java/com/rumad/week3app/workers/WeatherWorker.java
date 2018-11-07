package com.rumad.week3app.workers;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Log;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Tasks;
import com.rumad.week3app.MainActivity;
import com.rumad.week3app.R;
import com.rumad.week3app.model.WeatherResponse;
import com.rumad.week3app.service.RetrofitClient;
import com.rumad.week3app.service.WeatherService;

import java.io.IOException;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherWorker extends Worker {
    static final String CHANNEL_ID = "WEATHER_CHANNEL";
    static final String CHANNEL_NAME = "WEATHER";

    FusedLocationProviderClient fusedLocationProviderClient;
    WeatherService service;
    NotificationCompat.Builder builder;

    public WeatherWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        service = RetrofitClient.getService();
        builder= new NotificationCompat.Builder(context, CHANNEL_ID);

    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d(WeatherWorker.class.getName(), "Getting weather");
        try {
            Location location = Tasks.await(fusedLocationProviderClient.getLastLocation());
            WeatherResponse response = service.getCurrentWeather(WeatherService.APP_ID, location.getLatitude(), location.getLongitude())
                    .execute().body();
            Log.d(WeatherWorker.class.getName(), Double.toString(response.getMain().getTemp()));
            showNotification(response);
            return Result.SUCCESS;

        }
        catch (SecurityException e) {
            Log.d(WeatherWorker.class.getName(), e.getMessage());
            return Result.FAILURE;
        }
        catch (Exception e) {
            Log.d(WeatherWorker.class.getName(), e.getMessage());
            return Result.FAILURE;
        }
    }

    private void showNotification(WeatherResponse response) {
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Weather Info")
                .setContentText(Double.toString(response.getMain().getTemp()))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("For any weather fetching related stuff");

            NotificationManager notificationManager = getApplicationContext().getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(0, builder.build());
    }


}
