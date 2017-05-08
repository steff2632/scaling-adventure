package com.example.scalingadventure.data;

import com.google.gson.Gson;

import retrofit2.http.Path;
import retrofit2.http.Url;
import rx.Single;

/**
 * Created by stefanmay on 18/11/2016.
 */
public class MockStarWarsApi implements StarWars {

    @Override
    public Single<Films> getFilms() {
        Gson gson = new Gson();
        Films films = gson.fromJson(TestData.TEST_FILMS, Films.class);
        return Single.just(films);
    }

    @Override
    public Single<Film> getFilm(@Path("id") String id) {
        Gson gson = new Gson();
        Film films = gson.fromJson(TestData.TEST_FILM[0], Film.class);
        return Single.just(films);
    }

    @Override
    public Single<Character> getCharacter(@Url String id) {
        Gson gson = new Gson();
        Character character = gson.fromJson(TestData.TEST_CHARACTERS[0], Character.class);
        return Single.just(character);
    }
}
