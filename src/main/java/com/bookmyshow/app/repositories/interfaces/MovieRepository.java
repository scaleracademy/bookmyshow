package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String movieName);
}
