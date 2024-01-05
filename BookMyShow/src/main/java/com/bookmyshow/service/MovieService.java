package com.bookmyshow.service;

import com.bookmyshow.model.Movie;
import com.bookmyshow.repository.MovieRepository;

public class MovieService {
    private MovieRepository movieRepository;

    /*
    * Add new Movie.
    **/
    public Movie addMovie( Movie movie){
        return movieRepository.add(movie);
    }

}
