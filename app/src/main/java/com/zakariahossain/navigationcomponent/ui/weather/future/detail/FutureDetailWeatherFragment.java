package com.zakariahossain.navigationcomponent.ui.weather.future.detail;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zakariahossain.navigationcomponent.R;

public class FutureDetailWeatherFragment extends Fragment {

    private FutureDetailWeatherViewModel mViewModel;

    public static FutureDetailWeatherFragment newInstance() {
        return new FutureDetailWeatherFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.future_detail_weather_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FutureDetailWeatherViewModel.class);
        // TODO: Use the ViewModel
    }

}
