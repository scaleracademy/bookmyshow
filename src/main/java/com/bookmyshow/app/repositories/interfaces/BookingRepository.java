package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Booking;
import com.bookmyshow.app.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingsByCustomer(Customer customer);
}
