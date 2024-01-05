package com.bookmyshow.repository;

import com.bookmyshow.model.Movie;

import java.util.HashMap;
import java.util.Map;

public class MovieRepository {
    private Map<Long, Movie> movieMap = new HashMap<>();

    public Movie add(Movie movie){
        Long id = Long.valueOf(movieMap.size()+1);
        movie.setId(id);
        movieMap.put(id, movie);
        return movie;
    }

    public Movie get(Long id){
        return movieMap.get(id);
    }

    public void update(Long id, Movie movie){
        movieMap.put(id, movie);
    }
}
