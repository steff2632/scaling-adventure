package com.example.scalingadventure;

import com.example.scalingadventure.data.MockStarWarsApi;
import com.example.scalingadventure.data.StarWars;

/**
 * Created by stefanmay on 18/11/2016.
 */

public class TestStarWarsApplication extends StarWarsApplication {
    private TestAppComponent appComponent = new TestAppComponent() {
        @Override
        public void inject(StarWarsApplication starWarsApplication) {}

        @Override
        public StarWars getStarWarsClient() {
            return new MockStarWarsApi();
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent.inject(this);
    }

    public TestAppComponent component() {
        return appComponent;
    }
}
