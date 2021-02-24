package com.example.demo.service.impl;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long booking_id) {
        return null;
    }

    @Override
    public Booking pushBooking(Booking newBooking) {
        return null;
    }

    @Override
    public Booking updateBooking(Booking updatedBooking, Long booking_id) {
        return null;
    }

    @Override
    public void deleteBookingById(Long booking_id) {

    }
}

