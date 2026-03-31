package keywords;

// Class Definition
public class Product {

    // Static variable 
    private static double discount = 5;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Final variable 
    private final String productID;

    // Constructor using 'this'
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details using instanceof
    public void displayProductDetails() {

        if (this instanceof Product) {
            

            double discountedPrice =price - (price * discount / 100);

            System.out.println("Product ID: "+productID);
            System.out.println("Product Name: "+productName);
            System.out.println("Price: $" +price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + discountedPrice);
            System.out.println();
        } else {
            System.out.println("Invalid product object");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Update discount for all products
        Product.updateDiscount(10.0);

        // Create product objects
        Product product1 = new Product("Laptop", 1200.0, 5, "P001");

        Product product2 = new Product("Smartphone", 800.0, 10, "P002");

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
