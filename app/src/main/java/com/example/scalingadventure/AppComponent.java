package com.example.scalingadventure;

import com.example.scalingadventure.data.StarWars;
import com.example.scalingadventure.data.StarWarsClient;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by stefanmay on 06/11/2016.
 */

@Singleton
@Component(modules = {AppModule.class, StarWarsClient.class})
public interface AppComponent {
    void inject(StarWarsApplication starWarsApplication);

    StarWars getStarWarsClient();
}
