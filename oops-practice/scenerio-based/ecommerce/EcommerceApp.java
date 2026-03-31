package com.oops.ecommerce;

public class EcommerceApp {

	public static void main(String[] args) {

		Product product1 = new Product("101", "Phone", 15000);
		Product product2 = new Product("102", "Laptop", 55000);
		Product product3 = new Product("103", "Bottle", 500);

		Customer customer1 = new Customer("201", "Utkarsh");

		Order order1 = new Order("1001", customer1);
		order1.addProduct(product1);
		order1.addProduct(product3);

		Payment payment1 = new UpiPayment();
		Payment payment2 = new WalletPayment();

		order1.placeOrder(payment2);

		order1.checkStatus();
		order1.cancelOrder();
		order1.checkStatus();
		
		

	}

}
