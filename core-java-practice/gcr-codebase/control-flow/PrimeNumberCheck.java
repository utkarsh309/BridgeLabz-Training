package controlFlow;

//Create PrimeNumberCheck class to check whether a number is prime or not
import java.util.Scanner;

class PrimeNumberCheck {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take user input
     int number = input.nextInt();

     // Create boolean variable to store prime result
     boolean isPrime = true;

     // Prime numbers are greater than 1
     if (number > 1) {

         // Check divisibility from 2 to number - 1
         for (int i = 2; i < number; i++) {

             if (number % i == 0) {
                 isPrime = false;
                 break;
             }
         }

         // Display result
         if (isPrime) {
             System.out.println("The number " + number + " is a Prime Number");
         } else {
             System.out.println("The number " + number + " is not a Prime Number");
         }

     } else {
         System.out.println("The number " + number + " is not a Prime Number");
     }

     // Close the scanner
     input.close();
 }
}

