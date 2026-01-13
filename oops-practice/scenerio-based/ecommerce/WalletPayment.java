package com.oops.ecommerce;

class WalletPayment implements Payment{
	
	private double balance=5000;

	
	public void makePayment(double amount)throws PaymentFailedException{
		
		if(amount<=0) {
			throw new PaymentFailedException("Invalid Amount");
		}
		else if(amount>balance) {
			throw new PaymentFailedException("Insufficient Balance");
		}
		System.out.println("Payment successful for amount "+amount+" via wallet");
	}
}

