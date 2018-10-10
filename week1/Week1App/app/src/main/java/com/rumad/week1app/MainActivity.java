package com.rumad.week1app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rumad.week1app.model.Profile;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_OTHER = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Profile profile = new Profile("John", "Doe");
                startActivityForResult(OtherActivity.getIntent(MainActivity.this, profile), REQUEST_OTHER);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQUEST_OTHER: {
                switch (resultCode) {
                    case OtherActivity.RESULT_CLICKED : {
                        Toast.makeText(this, "Welcome back!. You clicked the other button!", Toast.LENGTH_LONG).show();
                        break;
                    }

                    default: {
                        Toast.makeText(this, "Welcome back!.", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            }
        }

    }
}


