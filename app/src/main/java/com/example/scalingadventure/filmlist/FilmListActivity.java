package com.example.scalingadventure.filmlist;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.scalingadventure.R;
import com.example.scalingadventure.StarWarsApplication;

import javax.inject.Inject;

public class FilmListActivity extends AppCompatActivity {

    @Inject
    FilmListPresenter filmListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FilmListFragment fragment = FilmListFragment.getInstance();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragment)
                .commit();

        DaggerFilmListComponent.builder()
                .filmListPresenterModule(new FilmListPresenterModule(fragment))
                .starWars(((StarWarsApplication) getApplication()).component().getStarWarsClient())
                .build()
                .inject(this);
    }
}
