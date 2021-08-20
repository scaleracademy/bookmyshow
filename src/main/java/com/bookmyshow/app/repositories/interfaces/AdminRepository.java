package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
