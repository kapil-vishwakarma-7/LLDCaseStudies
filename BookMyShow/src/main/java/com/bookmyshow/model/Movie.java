package com.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Movie extends Parent{
    private String name;
    private int duration;
    private List<Language> languagesAvailable;
    private List<Actor> actors;
    private List<MovieFeature> movieFeatures;

}
