package com.movie.detail.controller;

import com.movie.detail.model.Movie;
import com.movie.detail.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
   @GetMapping("/v1/movies")
    public List<Movie> getMovies() {
       return movieService.getMovies();
    }

    @GetMapping("/v1/movies/{id}")
    public Movie getMovies(@PathVariable String id) {
       return movieService.getMovieById(id);
    }
}
