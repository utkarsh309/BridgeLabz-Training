package com.oops.ecommerce;

//Product Class
class Product {

	private String productId;
	private String productName;
	private double price;
	
	Product(String productId,String productName,double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void displayProduct() {
		System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
	}
}
