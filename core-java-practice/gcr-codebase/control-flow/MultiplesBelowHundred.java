package controlFlow;

//Create MultiplesBelowHundred class to find multiples of a number below 100
import java.util.Scanner;

class MultiplesBelowHundred {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take user input
     int number = input.nextInt();

     // Check if number is a positive integer and less than 100
     if (number > 0 && number < 100) {

         // Find and print multiples of the number below 100
         for (int i = number; i < 100; i = i + number) {
             System.out.println(i);
         }

     } else {
         System.out.println("The number must be positive and less than 100");
     }

     // Close the scanner
     input.close();
 }
}
