package arrays;

//Create MultiplicationTableUsingArray class to print multiplication table using array
import java.util.Scanner;

class MultiplicationTable {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take user input for the number
     int number = input.nextInt();

     // Validate user input
     if (number <= 0) {
         System.out.println("Invalid number");
         input.close();
         return;
     }

     // Define constant for table size
     int tableSize = 10;

     // Create integer array to store multiplication results
     int[] multiplicationTable = new int[tableSize];

     // Store multiplication results in array
     for (int index = 0; index < multiplicationTable.length; index++) {
         multiplicationTable[index] = number * (index + 1);
     }

     // Display the multiplication table using array values
     for (int index = 0; index < multiplicationTable.length; index++) {
         System.out.println(number + " * " + (index + 1) + " = " + multiplicationTable[index]);
     }

     // Close the scanner
     input.close();
 }
}

