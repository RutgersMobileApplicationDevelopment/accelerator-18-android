package example.com.githupapp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    @GET("/users/{userName}")
    Call<GitHubUser> getUser(@Path("userName") String userName);
}
