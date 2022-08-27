package com.movie.detail.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String id;
    private String name;
    private Integer year;
}
