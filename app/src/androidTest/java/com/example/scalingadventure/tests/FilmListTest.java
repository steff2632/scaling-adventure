package com.example.scalingadventure.tests;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;

import com.dannyroa.espresso_samples.recyclerview.RecyclerViewMatcher;
import com.example.scalingadventure.R;
import com.example.scalingadventure.data.Film;
import com.example.scalingadventure.filmlist.FilmListActivity;
import com.example.scalingadventure.filmlist.FilmListAdapter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by stefanmay on 13/11/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class FilmListTest {

    @Rule
    public ActivityTestRule<FilmListActivity> mActivityRule = new ActivityTestRule<>(
            FilmListActivity.class);

    @Test
    public void testList() {

        int x = 1;//getRandomPosition(R.id.recyclerView);

        RecyclerView recyclerView = (RecyclerView) mActivityRule.getActivity().findViewById(R.id.recyclerView);
        FilmListAdapter filmListAdapter = (FilmListAdapter) recyclerView.getAdapter();
        Film film = filmListAdapter.getItemAt(x);

        RecyclerViewMatcher recyclerViewMatcher = new RecyclerViewMatcher(R.id.recyclerView);

        onView(recyclerViewMatcher.atPosition(x))
                .check(matches(hasDescendant(withText(film.title))));

        onView(recyclerViewMatcher.atPosition(x))
                .perform(click());

        onView(withId(R.id.txt_title))
                .check(matches(withText(film.title)));
    }

    private int getRandomPosition(int recyclerId) {
        Random ran = new Random();

        RecyclerView recyclerView = (RecyclerView) mActivityRule
                .getActivity().findViewById(recyclerId);

        int n = (recyclerView == null) ? 1 : recyclerView.getAdapter().getItemCount();

        System.out.println(n);

        return ran.nextInt(n);
    }

}
