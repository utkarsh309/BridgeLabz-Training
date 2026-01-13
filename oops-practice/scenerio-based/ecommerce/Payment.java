package com.oops.ecommerce;

//Payment Interface
interface Payment {

	public void makePayment(double amount) throws PaymentFailedException;
}
