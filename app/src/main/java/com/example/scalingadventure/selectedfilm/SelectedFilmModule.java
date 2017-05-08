package com.example.scalingadventure.selectedfilm;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stefanmay on 07/11/2016.
 */

@Module
public class SelectedFilmModule {

    private final SelectedFilmContract.View mView;

    public SelectedFilmModule(SelectedFilmContract.View view) {
        mView = view;
    }

    @Provides
    SelectedFilmContract.View providesFilmsListContractView() {
        return mView;
    }
}
