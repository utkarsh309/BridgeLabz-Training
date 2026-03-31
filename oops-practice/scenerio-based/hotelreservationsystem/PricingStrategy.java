package com.oops.hotelreservationsystem;

public interface PricingStrategy {

	double calculatePrice(double basePrice, int days);
}
