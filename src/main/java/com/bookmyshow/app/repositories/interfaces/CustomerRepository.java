package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Customer;

import java.util.Optional;

public interface CustomerRepository extends AbstractRepository<Customer, Long> {
    Optional<Customer> findCustomerByPhone(String phone);

    Optional<Customer> findCustomerByEmail(String email);
}
