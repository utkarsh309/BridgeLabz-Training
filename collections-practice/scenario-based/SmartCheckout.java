package scenario;

import java.util.*;

//Customer class
class Customer {
 String name;
 List<String> items;

 Customer(String name, List<String> items) {
     this.name = name;
     this.items = items;
 }
}

//Store class (uses HashMap)
class ItemStore {

 // price map
 HashMap<String, Integer> priceMap = new HashMap<>();

 // stock map
 HashMap<String, Integer> stockMap = new HashMap<>();

 ItemStore() {
     // sample items
     priceMap.put("Milk", 50);
     priceMap.put("Bread", 30);
     priceMap.put("Eggs", 10);

     stockMap.put("Milk", 5);
     stockMap.put("Bread", 3);
     stockMap.put("Eggs", 10);
 }

 public int getPrice(String item) {
     return priceMap.get(item);
 }

 public boolean isInStock(String item) {
     return stockMap.get(item) > 0;
 }

 public void reduceStock(String item) {
     stockMap.put(item, stockMap.get(item) - 1);
 }
}

//Queue system
class CheckoutQueue {

 Queue<Customer> queue = new LinkedList<>();

 public void addCustomer(Customer customer) {
     queue.add(customer);
     System.out.println(customer.name + " added to queue");
 }

 public void processCustomer(ItemStore store) {

     if (queue.isEmpty()) {
         System.out.println("No customers in queue");
         return;
     }

     Customer customer = queue.remove();
     System.out.println("\nProcessing customer: " + customer.name);

     int total = 0;

     for (String item : customer.items) {

         if (store.isInStock(item)) {
             int price = store.getPrice(item);
             total += price;
             store.reduceStock(item);
             System.out.println(item + " purchased for " + price);
         } else {
             System.out.println(item + " is out of stock");
         }
     }

     System.out.println("Total bill for " + customer.name +" " + total);
 }
}

//Main class
public class SmartCheckout {

 public static void main(String[] args) {

     ItemStore store = new ItemStore();
     CheckoutQueue counter = new CheckoutQueue();

     // Customers
     Customer c1 = new Customer("Utkarsh", Arrays.asList("Milk", "Bread"));
     Customer c2 = new Customer("Aman", Arrays.asList("Eggs", "Milk", "Milk"));

     // Add customers
     counter.addCustomer(c1);
     counter.addCustomer(c2);

     // Process queue
     counter.processCustomer(store);
     counter.processCustomer(store);
 }
}
