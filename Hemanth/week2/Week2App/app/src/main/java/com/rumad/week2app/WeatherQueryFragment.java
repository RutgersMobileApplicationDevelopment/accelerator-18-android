package com.rumad.week2app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link WeatherQueryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherQueryFragment extends Fragment {
    EditText editText;


    public WeatherQueryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeatherQueryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeatherQueryFragment newInstance(String param1, String param2) {
        WeatherQueryFragment fragment = new WeatherQueryFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_weather_query, container, false);
        editText = view.findViewById(R.id.editText);

        return view;
    }
}
