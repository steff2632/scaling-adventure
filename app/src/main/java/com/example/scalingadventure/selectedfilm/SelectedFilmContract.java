package com.example.scalingadventure.selectedfilm;

import com.example.scalingadventure.BaseView;
import com.example.scalingadventure.data.Character;
import com.example.scalingadventure.data.Film;

/**
 * Created by stefanmay on 08/11/2016.
 */

public interface SelectedFilmContract {

    interface View extends BaseView<Presenter> {

        void setFilm(Film film);
        void setCharacters(Character[] characters);
    }

    interface Presenter {
        void getCharacters();
        Film getFilm();
    }
}
