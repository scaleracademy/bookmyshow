package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
