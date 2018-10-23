package example.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = new AboutPage(this)
                .setImage(R.mipmap.ic_launcher)
                .setDescription("This is a description")
                .addFacebook("seantaylorlane")
                .addGitHub("seantaylorlane")
                .create();

        setContentView(rootView);
    }
}
