package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Movie;

import java.util.List;

public interface MovieRepository extends AbstractRepository<Movie, Long> {
    List<Movie> findByName(String movieName);
}
