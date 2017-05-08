package com.example.scalingadventure.filmlist;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stefanmay on 07/11/2016.
 */

@Module
public class FilmListPresenterModule {

    private final FilmListContract.View mView;

    public FilmListPresenterModule(FilmListContract.View view) {
        mView = view;
    }

    @Provides
    FilmListContract.View providesFilmsListContractView() {
        return mView;
    }
}
