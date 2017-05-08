package com.example.scalingadventure.tests;

import android.content.Intent;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.scalingadventure.R;
import com.example.scalingadventure.data.Film;
import com.example.scalingadventure.selectedfilm.SelectedFilmActivity;
import com.google.gson.Gson;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by stefanmay on 13/11/2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SelectedFilmTest {

    @Rule
    public ActivityTestRule<SelectedFilmActivity> mActivityRule = new ActivityTestRule<>(
            SelectedFilmActivity.class, true, false);


    @Test
    public void intent() {
        Film film = new Film();
        film.title = "film title";
        film.characters = new String[]{"http://swapi.co/api/people/1/"};
        film.director = "director";
        film.openingCrawl = "open\ni\nng\ncraw\nl\n\n";
        film.producer = "producer";


        Gson gson = new Gson();
        String string = gson.toJson(film, Film.class);

        Intent intent = new Intent();
        intent.putExtra(SelectedFilmActivity.EXTRA_FILM, string);

        mActivityRule.launchActivity(intent);


        onView(withId(R.id.txt_title)).check(matches(withText(film.title)));
        onView(withId(R.id.txt_director)).check(matches(withText(film.director)));
        onView(withId(R.id.txt_producer)).check(matches(withText(film.producer)));
        onView(withId(R.id.txt_openingCrawl)).check(matches(withText(film.openingCrawl)));
    }
}
