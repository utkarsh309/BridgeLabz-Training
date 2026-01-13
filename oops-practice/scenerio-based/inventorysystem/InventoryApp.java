package com.oops.inventorysystem;

public class InventoryApp {

	public static void main(String[] args) {

        AlertService alertService = new EmailAlertService();
        Inventory inventory = new Inventory(alertService);

        Product p1 = new Product("P101", "Keyboard", 500, 10);
        Product p2 = new Product("P102", "Mouse", 300, 4);
        Product p3 = new Product("P103", "Monitor", 12000, 2);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayProducts();

        try {
            inventory.updateProduct("P102", 3);
            inventory.updateProduct("P103", 0); // Will throw exception
        } catch (OutOfStockException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        inventory.displayProducts();
    }

}
