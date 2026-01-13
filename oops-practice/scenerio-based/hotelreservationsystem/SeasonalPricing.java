package com.oops.hotelreservationsystem;

public class SeasonalPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int days) {
        return (basePrice * 1.2) * days; 
    }
}
