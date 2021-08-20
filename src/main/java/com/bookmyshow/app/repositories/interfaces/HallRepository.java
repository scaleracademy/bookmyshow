package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepository extends JpaRepository<Hall, Long> {
}
