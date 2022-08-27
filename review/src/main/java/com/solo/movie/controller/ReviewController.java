package com.solo.movie.controller;

import com.solo.movie.model.Review;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    @GetMapping("v1/review")
    public Review getReview() {
        return  new Review(1 ,"This is a horrible movie");
    }
}
