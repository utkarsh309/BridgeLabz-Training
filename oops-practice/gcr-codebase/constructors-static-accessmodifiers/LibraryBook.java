package constructor;

//Class definition
public class LibraryBook {

    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available initially
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method
    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("Java Programming", "Herbert Schildt", 499.00);

        book.displayDetails();
        System.out.println();

        book.borrowBook();
        System.out.println();

        book.displayDetails();
    }
}
