package com.example.scalingadventure.selectedfilm;

import com.example.scalingadventure.data.Character;
import com.example.scalingadventure.data.Film;
import com.example.scalingadventure.data.StarWars;

import java.util.ArrayList;

import javax.inject.Inject;

import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by stefanmay on 08/11/2016.
 */

public class SelectedFilmPresenter implements SelectedFilmContract.Presenter {

    StarWars mStarWars;
    Film mFilm;
    SelectedFilmContract.View mView;

    @Inject
    SelectedFilmPresenter(SelectedFilmContract.View view, StarWars starWars, Film film) {
        mView = view;
        mStarWars = starWars;
        mFilm = film;
    }

    @Inject
    void setupListeners() {
        mView.setPresenter(this);
    }

    public Film getFilm() {
        return mFilm;
    }

    public void getCharacters() {
        ArrayList<Character> characters = new ArrayList<>(mFilm.characters.length);

        for (String character : mFilm.characters) {
            mStarWars.getCharacter(character).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new SingleSubscriber<Character>() {
                        @Override
                        public void onSuccess(Character value) {
                            mView.setCharacters(new Character[]{value});
                        }

                        @Override
                        public void onError(Throwable error) {
                            error.printStackTrace();
                        }
                    });
        }
    }
}
