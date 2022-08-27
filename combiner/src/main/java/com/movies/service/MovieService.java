package com.movies.service;

import com.movies.model.Movie;
import com.movies.model.MovieDetail;
import com.movies.model.Review;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class MovieService {
   private RestTemplate restTemplate;
    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Async
    public CompletableFuture<MovieDetail> getDetails() {
        System.out.println("Current Thread Name" + Thread.currentThread().getName());
        CompletableFuture<Movie> movie = getMovie();
        CompletableFuture<Review> review = getReview();
       return movie.thenCombine(review , MovieDetail::new);
    }

   @Async
    public CompletableFuture<Movie> getMovie() {
       System.out.println("Current Thread Name" + Thread.currentThread().getName());
       return  CompletableFuture.supplyAsync(() -> restTemplate.getForEntity("http://localhost:8090/v1/movies/1",Movie.class).getBody());
    }

   @Async
    public CompletableFuture<Review> getReview() {
       System.out.println("Current Thread Name" + Thread.currentThread().getName());
       return  CompletableFuture.supplyAsync(() -> restTemplate.getForEntity("http://localhost:8091/v1/review",Review.class).getBody());

    }
}
