package com.example.scalingadventure.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by stefanmay on 04/11/2016.
 */

public class Film {

    public String director;

    public String title;

    public String[] characters;

    @SerializedName("episode_id")
    public String episodeId;

    @SerializedName("opening_crawl")
    public String openingCrawl;

    @SerializedName("release_date")
    public String releaseDate;

    public String producer;
}
