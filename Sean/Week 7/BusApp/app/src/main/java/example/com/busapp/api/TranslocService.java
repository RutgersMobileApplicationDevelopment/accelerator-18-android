package example.com.busapp.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface TranslocService {
    @Headers({
            "X-Mashape-Key: hwtWzT6aNDmshpsrImZ8J3osN7JWp13m5nhjsnAbm9d2mdO0hD",
            "X-Mashape-Host: transloc-api-1-2.p.mashape.com"
    })
    @GET("routes.json")
    Call<RoutesResponse> getRoutes(@Query("agencies") String agencyID);
}
