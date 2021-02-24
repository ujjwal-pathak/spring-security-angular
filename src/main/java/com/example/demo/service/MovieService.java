package com.example.demo.service;

import com.example.demo.model.Booking;
import com.example.demo.model.Movie;

import java.time.LocalDate;
import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie getMovieById(Long movie_id);

    Movie pushMovie(Movie newMovie);

    Movie updateMovie(Movie updatedMovie, Long movie_id);

    void deleteMovie(Long movie_id);

    List<Booking> getAllBookingByMovieId(Long movie_id);

    List<Booking> getAllBookingByMovieIdAndDate(Long movie_id, LocalDate localDate);
}