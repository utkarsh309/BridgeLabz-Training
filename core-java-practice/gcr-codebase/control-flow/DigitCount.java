package controlFlow;

//Create DigitCount class to count number of digits in an integer
import java.util.Scanner;

class DigitCount {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Get integer input
     int number = input.nextInt();

     // Create variable to store digit count
     int count = 0;

     // Handle case when number is 0
     if (number == 0) {
         count = 1;
     } else {

         // Count digits using loop
         while (number != 0) {
             number = number / 10;
             count++;
         }
     }

     // Display the result
     System.out.println("The number of digits is " + count);

     // Close the scanner
     input.close();
 }
}

