package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long> {
}
