package com.example.scalingadventure.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by stefanmay on 04/11/2016.
 */

public class Character {

    @SerializedName("eye_color")
    public String eyeColor;

    @SerializedName("hair_color")
    public String hair_colour;

    @SerializedName("birth_year")
    public String birthYear;

    public String gender;
    public String name;
    public String mass;
    public String height;
}