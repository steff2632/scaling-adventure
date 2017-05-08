package com.example.scalingadventure.filmlist;

import com.example.scalingadventure.BaseView;
import com.example.scalingadventure.data.Film;

/**
 * Created by stefanmay on 07/11/2016.
 */

public interface FilmListContract {

    interface View extends BaseView<Presenter> {

        void onRefresh(Film[] films);
        void showSelectedItem(Film film);
    }

    interface Presenter {

        void doRefresh();
        void onItemSelected(Film film);
    }
}
