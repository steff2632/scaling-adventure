package com.example.scalingadventure.data;

import android.os.AsyncTask;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by stefanmay on 06/11/2016.
 */
@Module
public class StarWarsClient {

    public static final String BASE_URL = "http://swapi.co/api/";

    @Provides
    @Singleton
    public StarWars getStarWarsClient() {
        return getRetrofit().create(StarWars.class);
    }

    public Retrofit getRetrofit() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(getOkHttpClient())
                .callbackExecutor(AsyncTask.THREAD_POOL_EXECUTOR)
                .build();
        return retrofit;
    }

    public OkHttpClient getOkHttpClient() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
    }
}
