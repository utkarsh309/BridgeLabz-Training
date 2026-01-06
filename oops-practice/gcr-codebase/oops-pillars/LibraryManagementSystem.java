package oopsPillars;

import java.util.ArrayList;
import java.util.List;

// Abstract class
abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item Id: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Interface
interface Reservable {

    void reserveItem();

    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String borrowerName; // secured personal data

    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = "Reserved";
            System.out.println("Book reserved");
        } else {
            System.out.println("Book not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String borrowerName;

    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = "Reserved";
            System.out.println("Magazine reserved");
        } else {
            System.out.println("Magazine not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String borrowerName;

    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = "Reserved";
            System.out.println("DVD reserved");
        } else {
            System.out.println("DVD not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Basics", "James"));
        items.add(new Magazine(102, "Tech Today", "Editorial"));
        items.add(new DVD(103, "Learning Java", "Oracle"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable reservableItem = (Reservable) item;
            System.out.println("Available: " + reservableItem.checkAvailability());
            reservableItem.reserveItem();
            System.out.println();
        }
    }
}

