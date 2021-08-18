package com.bookmyshow.app.repositories.interfaces;

import com.bookmyshow.app.models.Booking;
import com.bookmyshow.app.models.Customer;

import java.util.List;

public interface BookingRepository extends AbstractRepository<Booking, Long> {
    List<Booking> getBookingsByCustomer(Customer customer);
}
