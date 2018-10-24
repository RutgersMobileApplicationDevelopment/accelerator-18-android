package com.rumad.week2app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WeatherListFragment extends Fragment {
    RecyclerView recyclerView;
    OnItemClickedListener callback;

    String [] names = new String[] { "Jay", "Mazaya", "Miles", "Sangho", "Zaid"};

    public interface OnItemClickedListener {
        public void onItemClicked(String name);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            callback = (OnItemClickedListener) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException((getActivity().toString() + "must implement " + OnItemClickedListener.class.getCanonicalName()));
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather_list, container, false);

        recyclerView = view.findViewById(R.id.recyclerview_weather);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new WeatherAdapter());


        // Inflate the layout for this fragment
        return view;
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
        public void onBindViewHolder(@NonNull WeatherViewHolder holder, final int position) {
            TextView textView = holder.itemView.findViewById(R.id.textView);
            textView.setText(names[position]);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    callback.onItemClicked(names[position]);
                }
            });
        }

        @Override
        public int getItemCount() {
            return names.length;
        }
    }


}
