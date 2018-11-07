package com.rumad.week3app.workers;

import android.content.Context;
import android.location.Location;
import android.util.Log;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.rumad.week3app.MainActivity;
import com.rumad.week3app.R;
import com.rumad.week3app.model.WeatherResponse;
import com.rumad.week3app.service.RetrofitClient;
import com.rumad.week3app.service.WeatherService;

import java.io.IOException;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherWorker extends Worker {
    FusedLocationProviderClient fusedLocationProviderClient;
    WeatherService service;

    public WeatherWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        service = RetrofitClient.getService();

    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d(WeatherWorker.class.getName(), "Getting weather");
        try {
            // Location location = fusedLocationProviderClient.getLastLocation().getResult();
            WeatherResponse response = service.getCurrentWeatherFromCity(WeatherService.APP_ID, "Seattle")
                    .execute().body();
            Log.d(WeatherWorker.class.getName(), Double.toString(response.getMain().getTemp()));
            return Result.SUCCESS;

        } catch (SecurityException e) {
            Log.d(WeatherWorker.class.getName(), e.getMessage());
            return Result.FAILURE;
        } catch (IOException e) {
            Log.d(WeatherWorker.class.getName(), e.getMessage());
            return Result.FAILURE;
        }
    }


}
