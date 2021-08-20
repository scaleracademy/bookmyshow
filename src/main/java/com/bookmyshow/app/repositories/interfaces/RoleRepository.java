package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> getRoleByName(String customer);
}
