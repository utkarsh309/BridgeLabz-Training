package com.oops.hotelreservationsystem;

import java.util.ArrayList;

public class HotelService {

    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public HotelService() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    // Add rooms
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added: " + room.getRoomNumber());
    }

    // Book room
    public Reservation bookRoom(Guest guest, String roomType, int days)
            throws RoomNotAvailableException {

        for (int i = 0; i < rooms.size(); i++) {

            Room room = rooms.get(i);

            if (room.isAvailable() && room.getRoomType().equalsIgnoreCase(roomType)) {
                room.setAvailable(false);

                Reservation reservation = new Reservation(guest, room, days);
                reservations.add(reservation);

                System.out.println("Room booked: " + room.getRoomNumber());
                return reservation;
            }
        }

        throw new RoomNotAvailableException("No " + roomType + " available.");
    }

    // Checkout
    public void checkout(Reservation reservation) {
        reservation.getRoom().setAvailable(true);
        System.out.println("Checked out successfully.");
    }

    // Generate bill using pricing strategy
    public double generateBill(Reservation reservation, PricingStrategy strategy) {

        Room room = reservation.getRoom();
        int days = reservation.getNumberOfDays();

        return strategy.calculatePrice(room.getBasePrice(), days);
    }
}