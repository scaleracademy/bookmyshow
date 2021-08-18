package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Role;

import java.util.Optional;

public interface RoleRepository extends AbstractRepository<Role, Long> {
    Optional<Role> getRoleByName(String customer);
}
