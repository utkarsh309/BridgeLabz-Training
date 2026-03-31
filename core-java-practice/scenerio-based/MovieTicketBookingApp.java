package scenerioBased;

//Create MovieTicketBookingApp class to handle movie ticket booking
import java.util.Scanner;

public class MovieTicketBookingApp {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Loop to serve multiple customers
     while (true) {

         // Ask user for movie type
         System.out.println("\nEnter movie type (action / comedy / drama) or type exit:");
         String movieType = input.next().toLowerCase();

         // Exit condition
         if (movieType.equals("exit")) {
             System.out.println("Thank you for using Movie Ticket Booking App 🎬");
             break;
         }

         // Ask for seat type
         System.out.println("Enter seat type (gold / silver):");
         String seatType = input.next().toLowerCase();

         // Ask for snacks
         System.out.println("Do you want snacks? (yes / no):");
         String snacksChoice = input.next().toLowerCase();

         double moviePrice = 0;
         double seatPrice = 0;
         double snacksPrice = 0;

         // Determine movie price using switch
         switch (movieType) {

             case "action":
                 moviePrice = 200;
                 break;

             case "comedy":
                 moviePrice = 180;
                 break;

             case "drama":
                 moviePrice = 160;
                 break;

             default:
                 System.out.println("Invalid movie type!");
                 continue; // skip this customer
         }

         // Determine seat price using if-else
         if (seatType.equals("gold")) {
             seatPrice = 150;
         } else if (seatType.equals("silver")) {
             seatPrice = 100;
         } else {
             System.out.println("Invalid seat type!");
             continue;
         }

         // Add snacks price if selected
         if (snacksChoice.equals("yes")) {
             snacksPrice = 80;
         }

         // Calculate total bill
         double totalAmount = moviePrice + seatPrice + snacksPrice;

         // Display booking summary
         System.out.println("\n--- Booking Summary ---");
         System.out.println("Movie Type  : " + movieType);
         System.out.println("Seat Type   : " + seatType);
         System.out.println("Snacks      : " + snacksChoice);
         System.out.println("Total Bill  : ₹" + totalAmount);
     }

     // Close Scanner
     input.close();
 }
}

