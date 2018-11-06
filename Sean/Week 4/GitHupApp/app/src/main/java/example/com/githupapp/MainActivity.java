package example.com.githupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import example.com.githupapp.api.GitHubService;
import example.com.githupapp.api.GitHubUser;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GitHubService service = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GitHubService.class);

        Button button = findViewById(R.id.button);
        final EditText username = findViewById(R.id.username);
        final TextView bio = findViewById(R.id.bio);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                service.getUser(username.getText().toString()).enqueue(new Callback<GitHubUser>() {
                    @Override
                    public void onResponse(Call<GitHubUser> call, Response<GitHubUser> response) {
                        if(response.isSuccessful()) {
                            GitHubUser user = response.body();
                            if(user != null) {
                                bio.setText(user.getBio());
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<GitHubUser> call, Throwable t) {

                    }
                });
            }
        });
    }
}
