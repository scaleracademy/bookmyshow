package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Movie;

import java.util.List;
import java.util.Optional;

// generic class over the type
// compile time polymorphism / C++ -> Template
public interface AbstractRepository<Entity, IdType> {
    // dont know how this will be implemented
    // CRUDL - create, read, update, delete, list
    void save(Entity entity); // save, update

    Optional<Movie> findById(IdType id); // Read

    void delete(Entity movie); // Delete

    List<Entity> findAll();
}
