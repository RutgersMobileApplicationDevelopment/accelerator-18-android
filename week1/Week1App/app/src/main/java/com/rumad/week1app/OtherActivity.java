package com.rumad.week1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rumad.week1app.model.Profile;

public class OtherActivity extends AppCompatActivity {
    static final String EXTRA_PROFILE = "com.rumad.week1app.OtherActivity" + "EXTRA_PROFILE";

    static final int RESULT_CLICKED = 1;

    static Intent getIntent(Context c, Profile profile) {
        Intent intent = new Intent(c, OtherActivity.class);
        intent.putExtra(EXTRA_PROFILE, profile);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button otherButton = findViewById(R.id.button_other);

        Profile profile = (Profile) getIntent().getSerializableExtra(EXTRA_PROFILE);
        otherButton.setText(profile.getFirstName());


        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CLICKED);
                finish();
            }
        });
    }
}
