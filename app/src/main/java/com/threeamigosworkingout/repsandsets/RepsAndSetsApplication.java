package com.threeamigosworkingout.repsandsets;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

public class RepsAndSetsApplication extends Application {

    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();

        // provide context
        appContext = getApplicationContext();

        // Timber logging setup
        Timber.plant(new Timber.DebugTree());
    }

    public static Context getAppContext() {
        return appContext;
    }
}
