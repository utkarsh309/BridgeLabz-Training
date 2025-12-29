package scenerioBased;

//Create LibraryFineCalculator class to calculate fine for late book returns
import java.util.Scanner;

public class LibraryFineCalculator {

 public static void main(String[] args) {

     // Create Scanner object to take input from the keyboard
     Scanner input = new Scanner(System.in);

     // Constant fine per day
     int finePerDay = 5;

     // Loop for 5 books
     for (int bookIndex = 1; bookIndex <= 5; bookIndex++) {

         System.out.println("\nBook " + bookIndex);

         // Take due date input
         System.out.print("Enter due date (day number): ");
         int dueDate = input.nextInt();

         // Take return date input
         System.out.print("Enter return date (day number): ");
         int returnDate = input.nextInt();

         // Check if book is returned late
         if (returnDate > dueDate) {

             int lateDays = returnDate - dueDate;
             int fineAmount = lateDays * finePerDay;

             System.out.println("Returned late by " + lateDays + " days");
             System.out.println("Fine Amount: ₹" + fineAmount);

         } else {

             System.out.println("Returned on time. No fine.");
         }
     }

     // Close Scanner
     input.close();
 }
}
