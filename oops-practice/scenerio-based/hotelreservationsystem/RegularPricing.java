package com.oops.hotelreservationsystem;

public class RegularPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int days) {
        return basePrice * days;
    }
}