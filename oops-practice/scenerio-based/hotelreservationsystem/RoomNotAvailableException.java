package com.oops.hotelreservationsystem;

public class RoomNotAvailableException extends Exception {

    public RoomNotAvailableException(String message) {
        super(message);
    }
}