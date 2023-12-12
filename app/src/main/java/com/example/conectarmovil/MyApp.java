package com.example.conectarmovil;

import android.app.Application;

public class MyApp extends Application {
    private Object FirebaseApp;

    @Override
    public void onCreate() {
        super.onCreate();
        // Inicializar Firebase
        FirebaseApp.finalize(this);
    }
}
