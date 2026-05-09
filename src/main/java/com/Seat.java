package com.bus.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    private int id;

    private int pnr_no;
    private String name;
    private String seat_label;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPnr_no() {
        return pnr_no;
    }

    public void setPnr_no(int pnr_no) {
        this.pnr_no = pnr_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeat_label() {
        return seat_label;
    }

    public void setSeat_label(String seat_label) {
        this.seat_label = seat_label;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}