package com.oops.ecommerce;

class UpiPayment implements Payment {

public void makePayment(double amount)throws PaymentFailedException{
		
		if(amount<=0) {
			throw new PaymentFailedException("Invalid Amount");
		}else if(amount>100000) {
			throw new PaymentFailedException("Limit Exceeds");
		}
		System.out.println("Payment successful for amount "+amount+" via Upi");
	}

}
