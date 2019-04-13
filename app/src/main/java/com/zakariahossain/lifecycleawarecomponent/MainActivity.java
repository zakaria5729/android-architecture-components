package com.zakariahossain.lifecycleawarecomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

//Lifecycle Owner
public class MainActivity extends AppCompatActivity implements MyCallback {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getLifecycle().addObserver(new MainActivityObserver(this));

        Log.i(TAG, "onCreate owner");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart owner");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume owner");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause owner");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop owner");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy owner");
    }

    @Override
    public void onStartUp() {
        Log.i(TAG, "onStartUp called");
        Toast.makeText(this, "onStartUp called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onShutDown() {
        Log.i(TAG, "onShutDown called");
        Toast.makeText(this, "onShutDown called", Toast.LENGTH_SHORT).show();
    }
}
