package com.example.scalingadventure.selectedfilm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.scalingadventure.R;
import com.example.scalingadventure.StarWarsApplication;
import com.example.scalingadventure.data.Film;
import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * Created by stefanmay on 08/11/2016.
 */

public class SelectedFilmActivity extends AppCompatActivity {

    public static final String EXTRA_FILM = "extra_film";

    Film film;

    @Inject
    SelectedFilmPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            String json = getIntent().getStringExtra(EXTRA_FILM);
            Gson gson = new Gson();
            film = gson.fromJson(json, Film.class);
        } catch (Exception e) {
            Log.e(SelectedFilmActivity.class.getSimpleName(), "Film not passed in as Intent Extra");
            e.printStackTrace();
            finish();
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(film.title);

        SelectedFilmFragment fragment = SelectedFilmFragment.getInstance();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragment);
        ft.commit();

        DaggerSelectedFilmComponent.builder()
                .selectedFilmModule(new SelectedFilmModule(fragment))
                .starWars(((StarWarsApplication) getApplication()).component().getStarWarsClient())
                .film(film)
                .build().inject(this);
    }
}
