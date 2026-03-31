package linkedList;

// Node Class
class TicketNode {

    // Attributes
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    // Next pointer
    TicketNode next;

    // Constructor
    TicketNode(int ticketId, String customerName,String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

// Ticket Reservation System Class
class TicketReservation {

    // Head pointer
    TicketNode head;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int id) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == id) {

                if (curr == head) {
                    TicketNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket removed successfully");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;

        do {
            displayTicket(temp);
            System.out.println();
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket by customer name
    public void searchByCustomer(String name) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for this customer");
        }
    }

    // Search ticket by movie name
    public void searchByMovie(String movie) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for this movie");
        }
    }

    // Count total booked tickets
    public void countTickets() {

        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets Booked: " + count);
    }

    // Display single ticket
    private void displayTicket(TicketNode node) {

        System.out.println("Ticket ID: " + node.ticketId);
        System.out.println("Customer Name: " + node.customerName);
        System.out.println("Movie Name: " + node.movieName);
        System.out.println("Seat Number: " + node.seatNumber);
        System.out.println("Booking Time: " + node.bookingTime);
    }
}

// Main Class
public class OnlineTicketReservationSystem {

    public static void main(String[] args) {

        TicketReservation system = new TicketReservation();

        system.addTicket(1, "Amit", "Inception", "A1", "10:00 AM");
        system.addTicket(2, "Neha", "Inception", "A2", "10:05 AM");
        system.addTicket(3, "Rahul", "Interstellar", "B1", "10:10 AM");

        System.out.println("All Tickets:");
        system.displayTickets();

        System.out.println("Search by Customer:");
        system.searchByCustomer("Amit");

        System.out.println("Search by Movie:");
        system.searchByMovie("Inception");

        system.countTickets();

        system.removeTicket(2);

        System.out.println("Final Ticket List:");
        system.displayTickets();

        system.countTickets();
    }
}
