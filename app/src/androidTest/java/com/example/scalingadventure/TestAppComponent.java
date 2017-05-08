package com.example.scalingadventure;

import com.example.scalingadventure.data.MockStarWarsApi;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by stefanmay on 18/11/2016.
 */
@Singleton
@Component(dependencies = MockStarWarsApi.class, modules = {TestAppModule.class, MockStarWarsApi.class})
public interface TestAppComponent extends AppComponent {
    void inject(StarWarsApplication starWarsApplication);
}
