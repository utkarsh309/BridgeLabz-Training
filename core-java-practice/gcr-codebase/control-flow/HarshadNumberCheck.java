package controlFlow;

//Create HarshadNumberCheck class to check whether a number is a Harshad Number
import java.util.Scanner;

class HarshadNumberCheck {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Get user input
     int number = input.nextInt();

     // Create variables to calculate sum of digits
     int sum = 0;
     int tempNumber = number;

     // Calculate sum of digits using while loop
     while (tempNumber != 0) {
         int digit = tempNumber % 10;
         sum = sum + digit;
         tempNumber = tempNumber / 10;
     }

     // Check if number is divisible by sum of digits
     if (sum != 0 && number % sum == 0) {
         System.out.println("Harshad Number");
     } else {
         System.out.println("Not a Harshad Number");
     }

     // Close the scanner
     input.close();
 }
}
