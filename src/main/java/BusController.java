package com.bus.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BusController {

    @Autowired
    SeatRepository repo;

    @GetMapping("/")
    public String home() {

        return "Bus Booking Backend Running";
    }

    @GetMapping("/seats")
    public List<Seat> getSeats() {

        return repo.findAll();
    }

    @PostMapping("/book")
    public Seat bookSeat(@RequestBody Seat seat) {

        return repo.save(seat);
    }
}