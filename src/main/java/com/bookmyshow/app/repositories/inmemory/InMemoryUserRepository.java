package com.bookmyshow.app.repositories.inmemory;

import com.bookmyshow.app.models.Movie;
import com.bookmyshow.app.models.User;
import com.bookmyshow.app.repositories.interfaces.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Machine coding rounds / Take home assignments
// Store the data in-memory

public class InMemoryUserRepository implements UserRepository {
    Map<Long, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        // very very very bad idea
        // bugs about shared objects
        // concurrency bugs
        users.put(user.getId(), user.clone());
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return Optional.empty();
    }
}


// DB -> store stuff in memory
// an Inmemory SQLite instance