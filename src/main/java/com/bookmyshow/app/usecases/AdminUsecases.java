package com.bookmyshow.app.usecases;

import com.bookmyshow.app.dtos.*;
import com.bookmyshow.app.models.*;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AdminUsecases {
    public Admin registerAdmin(AdminRegistrationDTO details) {
        return null;
    }

    public void deleteAdmin(Admin admin) {
    }

    public Admin updateAdmin(Admin admin, UpdateAdminDTO details) {
        return null;
    }

    public void updateUserRoles(User user, Set<Role> roles) {

    }

    public Cinema addCinema(CinemaDTO details) {
        return null;
    }

    public Cinema updateCinema(UpdateCinemaDTO details) {
        return null;
    }

    public void deleteCinema(Cinema cinema) {
    }


    public Hall addHall(HallDTO details) {
        return null;
    }

    public Hall updateHall(UpdateHallDTO details) {
        return null;
    }

    public void deleteHall(Hall hall) {
    }


    public HallSeat addHallSeat(HallSeatDTO details) {
        return null;
    }

    public HallSeat updateHallSeat(UpdateHallSeatDTO details) {
        return null;
    }

    public void deleteHallSeat(HallSeat hallSeat) {
    }

    public Movie addMovie(MovieDTO details) {
        return null;
    }

    public Movie updateMovie(UpdateMovieDTO details) {
        return null;
    }

    public void deleteMovie(Movie movie) {
    }


    public Show addShow(ShowDTO details) {
        return null;
    }

    public Show updateShow(UpdateShowDTO details) {
        return null;
    }

    public void deleteShow(Show show) {
    }


    public ShowSeat addShowSeat(ShowSeatDTO details) {
        return null;
    }

    public ShowSeat updateShowSeat(UpdateShowSeatDTO details) {
        return null;
    }

    public void deleteShowSeat(ShowSeat showSeat) {
    }
}
