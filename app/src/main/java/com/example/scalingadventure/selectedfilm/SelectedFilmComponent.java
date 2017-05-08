package com.example.scalingadventure.selectedfilm;

import com.example.scalingadventure.data.Film;
import com.example.scalingadventure.data.StarWars;

import dagger.Component;

/**
 * Created by stefanmay on 08/11/2016.
 */

@Component(dependencies = {StarWars.class, Film.class}, modules = SelectedFilmModule.class)
public interface SelectedFilmComponent {
    void inject(SelectedFilmActivity activity);
}
