package arrays;

//Create OddEvenArray class to store odd and even numbers in separate arrays
import java.util.Scanner;

class OddEvenArray {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take user input for the number
     int number = input.nextInt();

     // Validate natural number
     if (number <= 0) {
         System.out.println("Invalid input. Please enter a natural number.");
         input.close();
         return;
     }

     // Calculate maximum possible size for odd and even arrays
     int arraySize = number / 2 + 1;

     // Create arrays for odd and even numbers
     int[] oddNumbers = new int[arraySize];
     int[] evenNumbers = new int[arraySize];

     // Create index variables for odd and even arrays
     int oddIndex = 0;
     int evenIndex = 0;

     // Loop from 1 to the given number
     for (int value = 1; value <= number; value++) {

         // Check if number is even or odd
         if (value % 2 == 0) {
             evenNumbers[evenIndex] = value;
             evenIndex++;
         } else {
             oddNumbers[oddIndex] = value;
             oddIndex++;
         }
     }

     // Print odd numbers
     System.out.println("Odd Numbers:");
     for (int index = 0; index < oddIndex; index++) {
         System.out.println(oddNumbers[index]);
     }

     // Print even numbers
     System.out.println("Even Numbers:");
     for (int index = 0; index < evenIndex; index++) {
         System.out.println(evenNumbers[index]);
     }

     // Close the scanner
     input.close();
 }
}

