package example.com.busapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import example.com.busapp.api.Route;
import example.com.busapp.api.RoutesResponse;
import example.com.busapp.api.TranslocService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://transloc-api-1-2.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        TranslocService translocService = retrofit.create(TranslocService.class);

        translocService.getRoutes("1323").enqueue(new Callback<RoutesResponse>() {
            @Override
            public void onResponse(Call<RoutesResponse> call, Response<RoutesResponse> response) {
                if(!response.isSuccessful()) {
                    // Report error here
                    return;
                }
                RoutesResponse routesResponse = response.body();
                if(routesResponse == null) {
                    // Report error here
                    return;
                }
                RoutesResponse.Data data = routesResponse.getData();
                if(data == null) {
                    // Report error here
                    return;
                }
                List<Route> routes = data.getRoutes();
                if(routes == null) {
                    // Report error here
                    return;
                }
                for(Route route : routes) {
                    Log.d(TAG, route.getLongName());
                }
            }

            @Override
            public void onFailure(Call<RoutesResponse> call, Throwable t) {
                // Report error here
            }
        });
    }
}
