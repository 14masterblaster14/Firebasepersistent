package com.example.com.firebasepersistent;

/**
 * Created by comp on 4/1/2017.
 */

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}