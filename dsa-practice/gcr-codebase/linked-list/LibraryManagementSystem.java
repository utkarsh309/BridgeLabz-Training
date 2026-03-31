package linkedList;

// Node Class
class BookNode {

    // Attributes
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    // Pointers
    BookNode next;
    BookNode prev;

    // Constructor
    BookNode(int bookId, String title, String author,String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

// Library Management Class
class Library {

    // Head and Tail pointers
    BookNode head;
    BookNode tail;

    // Add book at beginning
    public void addAtBeginning(int id, String title, String author,String genre, boolean isAvailable) {

        BookNode newNode = new BookNode(id, title, author, genre, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add book at end
    public void addAtEnd(int id, String title, String author,String genre, boolean isAvailable) {

        BookNode newNode = new BookNode(id, title, author, genre, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add book at specific position (1-based)
    public void addAtPosition(int id, String title, String author,String genre, boolean isAvailable, int position) {

        if (position == 1) {
            addAtBeginning(id, title, author, genre, isAvailable);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, isAvailable);
        BookNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, isAvailable);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove book by ID
    public void removeByBookId(int id) {

        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully");
    }

    // Search by title
    public void searchByTitle(String title) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Search by author
    public void searchByAuthor(String author) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by this author");
        }
    }

    // Update availability status
    public void updateAvailability(int id, boolean status) {

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Display all books forward
    public void displayForward() {

        if (head == null) {
            System.out.println("No books available");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            System.out.println();
            temp = temp.next;
        }
    }

    // Display all books in reverse
    public void displayReverse() {

        if (tail == null) {
            System.out.println("No books available");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            System.out.println();
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {

        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books: " + count);
    }

    // Display single book
    private void displayBook(BookNode node) {

        System.out.println("Book ID: " + node.bookId);
        System.out.println("Title: " + node.title);
        System.out.println("Author: " + node.author);
        System.out.println("Genre: " + node.genre);
        System.out.println("Available: " + (node.isAvailable ? "Yes" : "No"));
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        library.addAtBeginning(1, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtEnd(2, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtEnd(3, "Harry Potter", "J.K. Rowling", "Fantasy", false);
        library.addAtPosition(4, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true, 2);

        System.out.println("Books (Forward):");
        library.displayForward();

        System.out.println("Books (Reverse):");
        library.displayReverse();

        System.out.println("Search by Author:");
        library.searchByAuthor("Joshua Bloch");

        System.out.println("Update Availability:");
        library.updateAvailability(3, true);

        System.out.println("Remove Book:");
        library.removeByBookId(2);

        library.countBooks();

        System.out.println("Final Book List:");
        library.displayForward();
    }
}
