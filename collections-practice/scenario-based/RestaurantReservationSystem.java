package scenario;

import java.util.*;

//Custom Exception
class TableAlreadyReservedException extends Exception {
 public TableAlreadyReservedException(String message) {
     super(message);
 }
}

//Table class
class Table {
 int tableNumber;

 Table(int tableNumber) {
     this.tableNumber = tableNumber;
 }
}

//Reservation class
class Reservation {
 int tableNumber;
 String timeSlot;
 String customerName;

 Reservation(int tableNumber, String timeSlot, String customerName) {
     this.tableNumber = tableNumber;
     this.timeSlot = timeSlot;
     this.customerName = customerName;
 }
}

//Main system class
class RestaurantSystem {

 // Map: tableNumber → Table
 Map<Integer, Table> tables = new HashMap<>();

 // List of reservations
 List<Reservation> reservations = new ArrayList<>();

 // Add tables to restaurant
 public void addTable(int tableNumber) {
     tables.put(tableNumber, new Table(tableNumber));
 }

 // Reserve table
 public void reserveTable(int tableNumber, String timeSlot, String customer)
         throws TableAlreadyReservedException {

     // Check if table exists
     if (!tables.containsKey(tableNumber)) {
         System.out.println("Table does not exist.");
         return;
     }

     // Check for double booking
     for (Reservation r : reservations) {
         if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
             throw new TableAlreadyReservedException("Table already reserved!");
         }
     }

     reservations.add(new Reservation(tableNumber, timeSlot, customer));
     System.out.println("Reservation successful for " + customer);
 }

 // Cancel reservation
 public void cancelReservation(int tableNumber, String timeSlot) {

     for (int i = 0; i < reservations.size(); i++) {
         Reservation r = reservations.get(i);

         if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
             reservations.remove(i);
             System.out.println("Reservation cancelled.");
             return;
         }
     }

     System.out.println("No such reservation found.");
 }

 // Show available tables for a given time
 public void showAvailableTables(String timeSlot) {

     System.out.println("Available tables at " + timeSlot + ":");

     for (int tableNum : tables.keySet()) {

         boolean reserved = false;

         for (Reservation r : reservations) {
             if (r.tableNumber == tableNum && r.timeSlot.equals(timeSlot)) {
                 reserved = true;
                 break;
             }
         }

         if (!reserved) {
             System.out.println("Table " + tableNum);
         }
     }
 }
}

//Main class
public class RestaurantReservationSystem {

 public static void main(String[] args) {

     RestaurantSystem system = new RestaurantSystem();

     // Add tables
     system.addTable(1);
     system.addTable(2);
     system.addTable(3);

     try {
         system.reserveTable(1, "7PM", "Amit");
         system.reserveTable(2, "7PM", "Neha");

         
         system.reserveTable(1, "7PM", "Rahul");

     } catch (TableAlreadyReservedException e) {
         System.out.println(e.getMessage());
     }

     System.out.println();

     system.showAvailableTables("7PM");

     System.out.println();

     system.cancelReservation(1, "7PM");

     System.out.println();

     system.showAvailableTables("7PM");
 }
}
