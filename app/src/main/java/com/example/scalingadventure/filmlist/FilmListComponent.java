package com.example.scalingadventure.filmlist;

import com.example.scalingadventure.data.StarWars;

import dagger.Component;

/**
 * Created by stefanmay on 07/11/2016.
 */

@Component(dependencies = StarWars.class, modules = {FilmListPresenterModule.class})
public interface FilmListComponent {

    void inject(FilmListActivity activity);
}
