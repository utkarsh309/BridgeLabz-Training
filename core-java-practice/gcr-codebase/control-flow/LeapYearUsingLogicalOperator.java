package controlFlow;

//Create LeapYearUsingLogicalOperator class to check whether a year is a leap year
import java.util.Scanner;

class LeapYearUsingLogicalOperator {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take year as input
     int year = input.nextInt();

     // Check if year is valid 
     if (year >= 1582) {


         //Using single if with logical operators
         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
             System.out.println("Year is a Leap Year");
         } else {
             System.out.println("Year is not a Leap Year");
         }

     } else {
         System.out.println("Year is not valid for Leap Year calculation");
     }

     // Close the scanner
     input.close();
 }
}

