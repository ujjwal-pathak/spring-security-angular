package com.example.demo.service;

import com.example.demo.model.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();

    Booking getBookingById(Long booking_id);

    Booking pushBooking(Booking newBooking);

    Booking updateBooking(Booking updatedBooking, Long booking_id);

    void deleteBookingById(Long booking_id);
}

