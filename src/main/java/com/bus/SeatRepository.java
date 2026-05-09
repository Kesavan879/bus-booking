package com.bus.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository
        extends JpaRepository<Seat, Integer> {

}