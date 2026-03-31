package linkedList;

// Node Class
class MovieNode {

    // Attributes
    String title;
    String director;
    int year;
    double rating;

    // Pointers
    MovieNode next;
    MovieNode prev;

    // Constructor
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

// Movie Management Class
class MovieManagement {

    // Head and Tail pointers
    MovieNode head;
    MovieNode tail;

    // Insert at beginning
    public void insertAtBeginning(String title, String director, int year, double rating) {

        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(String title, String director, int year, double rating) {

        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at specific position (1-based index)
    public void insertAtPosition(String title, String director, int year,double rating, int position) {

        if (position == 1) {
            insertAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(title, director, year, rating);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete movie by title
    public void deleteByTitle(String title) {

        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found");
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

        System.out.println("Movie deleted successfully");
    }

    // Search by director
    public void searchByDirector(String director) {

        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found for this director");
        }
    }

    // Search by rating
    public void searchByRating(double rating) {

        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found with this rating");
        }
    }

    // Update rating by title
    public void updateRatingByTitle(String title, double newRating) {

        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // Display movie
    public void displayMovie(MovieNode node) {

        System.out.println("Title: " + node.title);
        System.out.println("Director: " + node.director);
        System.out.println("Year: " + node.year);
        System.out.println("Rating: " + node.rating);
        System.out.println();
    }

    // Display all movies forward
    public void displayForward() {

        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display all movies in reverse
    public void displayReverse() {

        if (tail == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
}

// Main Class
public class MovieManagementSystem {

    public static void main(String[] args) {

        MovieManagement list = new MovieManagement();

        list.insertAtBeginning("Inception", "Christopher Nolan", 2010, 9.0);
        list.insertAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.insertAtEnd("Titanic", "James Cameron", 1997, 7.8);
        list.insertAtPosition("Avatar", "James Cameron", 2009, 8.0, 2);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("Movies (Reverse):");
        list.displayReverse();

        System.out.println("Search by Director:");
        list.searchByDirector("Christopher Nolan");

        System.out.println("Update Rating:");
        list.updateRatingByTitle("Titanic", 8.2);

        System.out.println("Delete Movie:");
        list.deleteByTitle("Avatar");

        System.out.println("Final Movie List:");
        list.displayForward();
    }
}
