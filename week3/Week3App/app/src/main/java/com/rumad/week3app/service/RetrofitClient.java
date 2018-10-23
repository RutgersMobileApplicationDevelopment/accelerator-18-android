package com.rumad.week3app.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    static Retrofit sRetrofit = null;
    static String BASE_URL = "https://api.openweathermap.org/";

    public static Retrofit getRetrofit() {
        if (sRetrofit == null) {
            sRetrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build();
        }
        return sRetrofit;
    }

    public static WeatherService getService() {
        return getRetrofit().create(WeatherService.class);
    }
}
