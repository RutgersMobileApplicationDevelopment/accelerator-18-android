package com.rumad.week3app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;


public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    FusedLocationProviderClient fusedLocationProviderClient;
    Location currLocation;

    static final int REQUEST_LOCATION = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frame_layout_holder);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        switchFragment(new WeatherQueryFragment());

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_CALENDAR)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                    REQUEST_LOCATION);
        } else {
            // can request location
            getLocation();
        }

    }

    private void getLocation() {
        try {
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {
                    if (location != null) {
                        currLocation = location;
                        Fragment currFragment = getSupportFragmentManager().findFragmentById(R.id.frame_layout_holder);

                        if (currFragment instanceof WeatherQueryFragment) {
                            ((WeatherQueryFragment) currFragment).updateLocation(currLocation);
                        }

                    }
                }
            });
        } catch (SecurityException e) {
            Log.d(MainActivity.class.getName(), e.getMessage());
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_LOCATION: {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getLocation();
                }
            }
        }
    }



    private void switchFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frame_layout_holder, fragment);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_weather, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_query: {
                switchFragment(new WeatherQueryFragment());
                return true;
            }

            case R.id.item_list: {
                switchFragment(new WeatherListFragment());
                return true;
            }
        }
        return false;
    }
}
