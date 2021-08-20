package com.bookmyshow.app.usecases;

import com.bookmyshow.app.models.Cinema;
import com.bookmyshow.app.models.Movie;
import com.bookmyshow.app.models.Show;
import com.bookmyshow.app.models.ShowSeat;
import com.bookmyshow.app.repositories.interfaces.CinemaRepository;
import com.bookmyshow.app.repositories.interfaces.MovieRepository;
import com.bookmyshow.app.repositories.interfaces.ShowRepository;
import com.bookmyshow.app.repositories.interfaces.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrowseMoviesUsecases {
    private final CinemaRepository cinemaRepository;
    private final ShowSeatRepository showSeatRepository;
    private final ShowRepository showRepository;
    private final MovieRepository movieRepository;

    public BrowseMoviesUsecases(CinemaRepository cinemaRepository, ShowSeatRepository showSeatRepository, ShowRepository showRepository, MovieRepository movieRepository) {
        this.cinemaRepository = cinemaRepository;
        this.showSeatRepository = showSeatRepository;
        this.showRepository = showRepository;
        this.movieRepository = movieRepository;
    }

    public List<Cinema> listCinemas() {
        return cinemaRepository.findAll();
    }

    public List<Movie> listMovies() {
        return movieRepository.findAll();
    }

    public List<Show> listShows() {
        return showRepository.findAll();
    }

    public List<ShowSeat> listShowSeats() {
        return showSeatRepository.findAll();
    }
}
