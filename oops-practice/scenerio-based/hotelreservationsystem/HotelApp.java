package com.oops.hotelreservationsystem;

public class HotelApp {

	public static void main(String[] args) {

        HotelService service = new HotelService();

        // Add rooms
        service.addRoom(new StandardRoom(101, 2000));
        service.addRoom(new StandardRoom(102, 2000));
        service.addRoom(new DeluxeRoom(201, 4000));

        // Guest
        Guest guest = new Guest(1, "Utkarsh");

        try {
            // Booking
            Reservation reservation = service.bookRoom(guest, "Deluxe Room", 3);

            // Pricing strategy
            PricingStrategy pricing = new SeasonalPricing();

            // Generate bill
            double bill = service.generateBill(reservation, pricing);

            System.out.println("Guest: " + guest.getGuestName());
            System.out.println("Room Type: " + reservation.getRoom().getRoomType());
            System.out.println("Total Bill: " + bill);

            // Checkout
            service.checkout(reservation);

        } catch (RoomNotAvailableException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

}
