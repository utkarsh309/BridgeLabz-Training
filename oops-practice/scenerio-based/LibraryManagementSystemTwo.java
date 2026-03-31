package scenerioBased2;

import java.util.ArrayList;
import java.util.List;

//Main Class
public class LibraryManagementSystemTwo {

    public static void main(String[] args) {

        Book[] bookArray = {
            new Book("Java Basics", "James", "Available"),
            new Book("Python Guide", "Guido", "Available"),
            new Book("Data Structures", "Mark", "Checked Out")
        };

        List<Book> books = new ArrayList<>();

        for (Book book : bookArray) {
            books.add(book);
        }

        displayBooks(books);

        System.out.println("Searching for Java:");
        searchBook(books, "Java");

        try {
            checkoutBook(books, "Data Structures");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkoutBook(books, "Python Guide");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("After Checkout:");
        displayBooks(books);
    }

    //Method to display Books
    public static void displayBooks(List<Book> books) {

        for (Book book : books) {
            System.out.println(book.getTitle() +"  "+ book.getAuthor() + "  " + book.getStatus());
        }
    }

    public static void searchBook(List<Book> books, String title) {

        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book.getTitle() + "  " + book.getAuthor() + "  " + book.getStatus());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    public static void checkoutBook(List<Book> books, String title)
            throws BookNotAvailableException {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.getStatus().equalsIgnoreCase("Checked Out")) {
                    throw new BookNotAvailableException("Book is already checked out");
                }

                book.setStatus("Checked Out");
                System.out.println("Book checked out successfully");
                return;
            }
        }

        System.out.println("Book not found");
    }
}

class Book {

    private String title;
    private String author;
    private String status;

    Book(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

//Custom Exception
class BookNotAvailableException extends Exception {

    BookNotAvailableException(String message) {
        super(message);
    }
}
