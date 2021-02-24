package com.example.demo.controller;

import com.example.demo.exception.BookingNotFoundException;
import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingRepository repository;


    @GetMapping("/bookinghistory")
    List<Booking> findAll() {
        return repository.findAll();
    }

    @GetMapping("/booking/{id}")
    Booking findById(@PathVariable Long id) {
        Optional<Booking> optionalBooking=repository.findById(id);
        if(optionalBooking.isPresent())
            return optionalBooking.get();
        throw new BookingNotFoundException(id);
    }

    @PostMapping("/newbooking")
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    Booking newBook(@RequestBody Booking newBooking) {
        return repository.save(newBooking);
    }

}
