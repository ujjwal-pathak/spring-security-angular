package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.model.User;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/listmovies")
    List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/listusers")
    List<User> findUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/addmovie")
    @ResponseStatus(HttpStatus.CREATED)
    Movie addMovie(@RequestBody Movie newMovie) {

        return movieRepository.save(newMovie);
    }

    @PutMapping("/updatemovie")
    @ResponseStatus(HttpStatus.CREATED)
    Movie updateMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @PostMapping("/deletemovie")
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    void deleteMovie(@RequestBody Movie movie) {
        movieRepository.delete(movie);
    }

}
