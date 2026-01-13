package com.oops.ecommerce;
import java.util.List;
import java.util.ArrayList;

class Order {
	private String orderId;
	private String status;
	Customer customer;
	List<Product>products=new ArrayList<>();
	
	Order(String orderId,Customer customer){
		this.orderId=orderId;
		this.status="Created";
		this.customer=customer;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public double totalAmount() {
		
		double total=0;
		for(Product product:products) {
			
			total+=product.getPrice();
		}
		return total;
	}
	
	public void placeOrder(Payment payment) {
		try {
			double amount=totalAmount();
			payment.makePayment(amount);
			status="Placed";
			System.out.println("Order Placed Successfully");
			
		}catch(PaymentFailedException e) {
			status="Failed";
			System.out.println("Order Failed: "+e.getMessage());
		}
	}
	
	public void cancelOrder() {
		if(status.equals("Placed")) {
			status="Cancelled";
			return;
		}
		System.out.println("Order Not cancelled");
	}
	
	public void checkStatus() {
		System.out.println("Order Status: "+status);
	}
}
