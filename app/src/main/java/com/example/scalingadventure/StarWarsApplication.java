package com.example.scalingadventure;

import android.app.Application;

/**
 * Created by stefanmay on 06/11/2016.
 */

public class StarWarsApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent component() {
        return appComponent;
    }
}
