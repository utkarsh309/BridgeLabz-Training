package controlFlow;

//Create FactorUsingWhileLoop class to find factors of a number using while loop
import java.util.Scanner;

class FactorUsingWhileLoop {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Get user input
     int number = input.nextInt();

     // Check if number is a positive integer
     if (number > 0) {

         // Create counter variable
         int counter = 1;

         // Run while loop till counter is less than the number
         while (counter < number) {

             // Check if number is perfectly divisible by counter
             if (number % counter == 0) {
                 System.out.println(counter);
             }
             counter++;
         }

     } else {
         System.out.println("The number is not a positive integer");
     }

     // Close the scanner
     input.close();
 }
}

