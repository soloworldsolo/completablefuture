package com.movie.detail.service;

import com.movie.detail.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> getMovies() {
       return List.of( new Movie("1" ,"DarkKnight",1985) ,
               new Movie("2","Lord Of the rings",2008));
    }

    public Movie getMovieById(String id) {
        return new Movie("1","DarkKnight",1989);
    }
}
