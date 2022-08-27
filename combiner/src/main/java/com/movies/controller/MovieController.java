package com.movies.controller;

import com.movies.model.MovieDetail;
import com.movies.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("v1/mapping")
    public CompletableFuture<MovieDetail> getDetails() {
        return movieService.getDetails();
    }
}
