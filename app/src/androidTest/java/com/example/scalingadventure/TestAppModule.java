package com.example.scalingadventure;

import com.example.scalingadventure.data.MockStarWarsApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stefanmay on 18/11/2016.
 */

@Module
public class TestAppModule {
    private final TestStarWarsApplication application;

    public TestAppModule(TestStarWarsApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    TestStarWarsApplication application() {
        return application;
    }

    @Provides
    public MockStarWarsApi provideWeatherApiClient() {
        return new MockStarWarsApi();
    }
}
