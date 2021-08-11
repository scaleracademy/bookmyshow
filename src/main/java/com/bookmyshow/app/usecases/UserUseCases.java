package com.bookmyshow.app.usecases;

import com.bookmyshow.app.models.Booking;
import com.bookmyshow.app.models.User;
import com.bookmyshow.app.repositories.interfaces.UserRepository;

public class UserUseCases {
    UserRepository userRepository;

    public Booking makeBooking(String movieName, String showSlot, String cinemaHallName) {
        User user = new User();
        userRepository.save(user); // the user to be saved
        user.setUsername("kjbfkjbds");

        User user2 = userRepository.findById(user.getId());
//        userRepository.save(user); // the user to be saved
        // I want to access the list of movies to figure out which movie's show in which cinema
    }
}
