package com.solo.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {
    public Integer id;
    public String review;
}
