package example.com.busapp.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TranslocService {
    @GET("routes.json")
    Call<List<Route>> getRoutes(@Query("agencies") String agencyID);
}
