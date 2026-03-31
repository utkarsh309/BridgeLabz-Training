package controlFlow;

//Create FactorOfNumber class to find factors of a number
import java.util.Scanner;

class FactorOfNumber {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take user input
     int number = input.nextInt();

     // Check if number is a positive integer
     if (number > 0) {

         // Find and print factors of the number
         for (int i = 1; i < number; i++) {
             if (number % i == 0) {
                 System.out.println(i);
             }
         }

     } else {
         System.out.println("The number is not a positive integer");
     }

     // Close the scanner
     input.close();
 }
}

