package com.bookmyshow.app.usecases;

import com.bookmyshow.app.dtos.CreateBookingDTO;
import com.bookmyshow.app.dtos.CustomerRegistrationDTO;
import com.bookmyshow.app.dtos.UpdateCustomerDTO;
import com.bookmyshow.app.models.*;

import java.util.List;

public class CustomerUsecases {
    public Customer registerCustomer(CustomerRegistrationDTO details) {
        return null;
    }

    public void deleteCustomer(Customer customerProfile) {
    }

    public Customer updateCustomer(UpdateCustomerDTO details) {
        return null;
    }

    public Booking createBooking(Customer customer, CreateBookingDTO details) {
        return null;
    }

    public Booking cancelBooking(Booking booking) {
        return null;
    }

    public List<Booking> listCustomerBookings(Customer customer) {
        return null;
    }

    public List<Cinema> listCinemas() {
        return null;
    }

    public List<Movie> listMovies() {
        return null;
    }

    public List<Show> listShows() {
        return null;
    }

    public List<ShowSeat> showSeats() {
        return null;
    }
}
