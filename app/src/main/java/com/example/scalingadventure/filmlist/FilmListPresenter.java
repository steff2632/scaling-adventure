package com.example.scalingadventure.filmlist;

import com.example.scalingadventure.data.Film;
import com.example.scalingadventure.data.Films;
import com.example.scalingadventure.data.StarWars;

import javax.inject.Inject;

import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by stefanmay on 07/11/2016.
 */

public class FilmListPresenter implements FilmListContract.Presenter {

    StarWars mStarWars;

    FilmListContract.View mView;

    @Inject
    FilmListPresenter(FilmListContract.View view, StarWars starWars) {
        mView = view;
        mStarWars = starWars;
    }

    @Inject
    void setupListeners() {
        mView.setPresenter(this);
    }

    @Override
    public void doRefresh() {

        mStarWars.getFilms()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleSubscriber<Films>() {
                    @Override
                    public void onSuccess(Films value) {
                        mView.onRefresh(value.results);
                    }

                    @Override
                    public void onError(Throwable error) {
                        error.printStackTrace();
                    }
                });
    }

    @Override
    public void onItemSelected(Film film) {
        mView.showSelectedItem(film);
    }
}
