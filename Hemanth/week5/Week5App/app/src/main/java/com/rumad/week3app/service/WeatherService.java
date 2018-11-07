package com.rumad.week3app.service;

import com.rumad.week3app.model.ForecastResponse;
import com.rumad.week3app.model.WeatherResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
     String APP_ID = "d8e7907c99a2a1b5a167553df8bf8fed";

    @GET("/data/2.5/weather")
    Call<WeatherResponse> getCurrentWeather(@Query("appid") String appid,
                                            @Query("lat") Double lat,
                                            @Query("lon") Double lng);

    @GET("/data/2.5/weather")
    Call<WeatherResponse> getCurrentWeatherFromCity(@Query("appid") String appid,
                                            @Query("q") String city);

    @GET("/data/2.5/forecast")
    Call<ForecastResponse> getForecast(@Query("appid") String appid, @Query("q") String city, @Query("lat") Double lat,
                                       @Query("lon") Double lng);

}
