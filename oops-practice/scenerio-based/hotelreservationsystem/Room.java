package com.oops.hotelreservationsystem;

public abstract class Room {

	private int roomNumber;
    private boolean available;
    private double basePrice;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract String getRoomType();
}
