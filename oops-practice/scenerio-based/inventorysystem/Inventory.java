package com.oops.inventorysystem;

import java.util.ArrayList; 

class Inventory {

	private ArrayList<Product> products;
	private AlertService alertService;
	
	private static final int LOW_STOCK_LIMIT=3;
	
	public Inventory(AlertService alertService) {
		this.products = new ArrayList<>();
		this.alertService = alertService;
	}
	
	//Add Product
	public void addProduct(Product product) {
		
		if(product==null) {
			System.out.println("Invalid Product ");
			return;
		}
		
		products.add(product);
		System.out.println("Product Added Successfully: "+product.getProductName());
		
	}
	
	//Update Product
	public void updateProduct(String productId,int newQuantity)throws OutOfStockException {
		
		Product product=findProductById(productId);
		
		if (product == null) {
            System.out.println("Product not found.");
            return;
        }
		if (newQuantity < 0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }
		
		product.setQuantity(newQuantity);
        System.out.println("Stock updated for: " + product.getProductName());
        
        if (newQuantity == 0) {
            throw new OutOfStockException(product.getProductName() + " is out of stock.");
        }
        
        if (newQuantity <= LOW_STOCK_LIMIT) {
            alertService.sendLowStockAlert(product);
        }
	}
	
	// Display all products
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("Product List:");
        for (int i = 0; i < products.size(); i++) {

            Product product = products.get(i);

			System.out.println(product.getProductId() + " - " + product.getProductName() + " Price: "
					+ product.getPrice() + " Quantity: " + product.getQuantity());
        }
    }
	
	//Find product by id
	public Product findProductById(String productId) {
		
		for(Product product:products) {
			
			if(product.getProductId().equalsIgnoreCase(productId)) {
				return product;
			}
		}
		return null;
	}
	
	
}
