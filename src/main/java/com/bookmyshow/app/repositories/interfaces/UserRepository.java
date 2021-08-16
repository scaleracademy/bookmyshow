package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.User;

import java.util.Optional;

public interface UserRepository extends AbstractRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
}
