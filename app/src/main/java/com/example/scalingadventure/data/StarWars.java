package com.example.scalingadventure.data;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;
import rx.Single;

/**
 * Created by stefanmay on 04/11/2016.
 */

public interface StarWars {

    @GET("films")
    Single<Films> getFilms();

    @GET("films/{id}")
    Single<Film> getFilm(@Path("id") String id);

    @GET
    Single<Character> getCharacter(@Url String id);
}
