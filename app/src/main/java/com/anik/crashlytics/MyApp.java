package com.anik.crashlytics;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class MyApp extends Application {

    //for crashlytics. if i use this,then you don't need to write crashlytics code in every activity

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());


    }
}