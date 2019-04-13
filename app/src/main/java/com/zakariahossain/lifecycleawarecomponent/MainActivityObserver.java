package com.zakariahossain.lifecycleawarecomponent;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

//Lifecycle Observer
class MainActivityObserver implements LifecycleObserver {

    private String TAG = this.getClass().getSimpleName();
    private MyCallback myCallback;

    MainActivityObserver(MyCallback myCallback) {
        this.myCallback = myCallback;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void myOnCreate() {
        Log.i(TAG, "onCreate observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void myOnStart() {
        myCallback.onStartUp();
        Log.i(TAG, "onStart observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void myOnResume() {
        Log.i(TAG, "onResume observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void myOnPause() {
        Log.i(TAG, "onPause observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void myOnStop() {
        myCallback.onShutDown();
        Log.i(TAG, "onStop observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void myOnDestroy() {
        Log.i(TAG, "onDestroy observer");
    }
}
