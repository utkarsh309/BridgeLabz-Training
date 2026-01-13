package com.oops.hotelreservationsystem;

public class Reservation {

    private Guest guest;
    private Room room;
    private int numberOfDays;

    public Reservation(Guest guest, Room room, int numberOfDays) {
        this.guest = guest;
        this.room = room;
        this.numberOfDays = numberOfDays;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}