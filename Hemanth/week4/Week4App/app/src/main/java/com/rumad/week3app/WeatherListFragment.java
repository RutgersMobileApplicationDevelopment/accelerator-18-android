package com.rumad.week3app;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rumad.week3app.model.ForecastResponse;
import com.rumad.week3app.model.WeatherResponse;
import com.rumad.week3app.service.RetrofitClient;
import com.rumad.week3app.service.WeatherService;

import java.io.IOException;
import java.util.ArrayList;


public class WeatherListFragment extends Fragment implements MainActivity.MyLocationListener {

    RecyclerView recyclerView;
    Button button;
    EditText editText;

    WeatherService service;

    ArrayList<ForecastResponse.ListBean> items = new ArrayList<>();

    @Override
    public void updateLocation(Location location) {
        updateWeather(location);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_weather_list, container, false);
        service = RetrofitClient.getService();

        recyclerView = view.findViewById(R.id.recyclerview_weather);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new WeatherAdapter());
        button = view.findViewById(R.id.button_list);
        editText = view.findViewById(R.id.edittext_list);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateWeather(null);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        MainActivity activity = (MainActivity) getActivity();
        activity.getLocation();
    }

    private void updateWeather(Location location) {
        Call<ForecastResponse> call;
        if (location != null) {
            call = service.getForecast(WeatherService.APP_ID, null, location.getLatitude(), location.getLongitude());
        } else {
            call = service.getForecast(WeatherService.APP_ID, editText.getText().toString(), null, null);
        }

        call.enqueue(new Callback<ForecastResponse>() {
            @Override
            public void onResponse(Call<ForecastResponse> call, Response<ForecastResponse> response) {
                items = new ArrayList<>(response.body().getList());
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ForecastResponse> call, Throwable t) {
                Log.d(WeatherListFragment.class.getName(), t.getMessage());
            }
        });
    }


    private class WeatherViewHolder extends RecyclerView.ViewHolder {
        WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {
        @NonNull
        @Override
        public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_weather, parent, false);

            return new WeatherViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
            TextView textView = holder.itemView.findViewById(R.id.textView);
            ForecastResponse.ListBean curr = items.get(position);
            textView.setText(Double.toString(curr.getMain().getTemp()));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }


}
