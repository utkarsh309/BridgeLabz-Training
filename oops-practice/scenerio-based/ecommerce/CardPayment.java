package com.oops.ecommerce;

class CardPayment implements Payment {
	
	public void makePayment(double amount)throws PaymentFailedException{
		
		if(amount<=0) {
			throw new PaymentFailedException("Invalid Amount");
		}
		System.out.println("Payment successful for amount "+amount+" via card");
	}

}
