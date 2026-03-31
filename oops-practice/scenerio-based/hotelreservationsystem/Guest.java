package com.oops.hotelreservationsystem;

public class Guest {

    private int guestId;
    private String guestName;

    public Guest(int guestId, String guestName) {
        this.guestId = guestId;
        this.guestName = guestName;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }
}
