package oopsPillars;

import java.util.ArrayList;
import java.util.List;

// Abstract class
abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // getters (encapsulation)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // abstract method
    abstract double calculateTotalPrice();

    // concrete method
    public void getItemDetails() {
        System.out.println(itemName + " Price: " + price + " Qty: " + quantity);
    }
}

// Interface
interface Discountable {

    double applyDiscount(double amount);

    String getDiscountDetails();
}

// Veg item
class VegItem extends FoodItem implements Discountable {

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% discount
    }

    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}

// Non-Veg item
class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra charge
    }

    public double applyDiscount(double amount) {
        return amount * 0.95; // 5% discount
    }

    public String getDiscountDetails() {
        return "5% discount on Non-Veg items";
    }
}

// Main class
public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Curry", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(order);
    }

    
    public static void processOrder(List<FoodItem> order) {

        double finalAmount = 0;

        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            Discountable discountItem = (Discountable) item;
            double discountedPrice = discountItem.applyDiscount(total);

            System.out.println("Total: " + total);
            System.out.println(discountItem.getDiscountDetails());
            System.out.println("After Discount: " + discountedPrice);
            System.out.println();

            finalAmount += discountedPrice;
        }

        System.out.println("Final Bill Amount: " + finalAmount);
    }
}
