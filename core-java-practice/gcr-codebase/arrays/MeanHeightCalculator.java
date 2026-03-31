package arrays;

//Create MeanHeightCalculator class to find mean height of football players
import java.util.Scanner;

class MeanHeightCalculator {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Define constant for total number of players
     int totalPlayers = 11;

     // Create double array to store heights of players
     double[] heights = new double[totalPlayers];

     // Variable to store sum of heights
     double sumOfHeights = 0.0;

     // Take user input for heights and calculate sum
     for (int index = 0; index < heights.length; index++) {

         double height = input.nextDouble();

         // Validate height
         if (height <= 0) {
             System.out.println("Invalid height");
             input.close();
             return;
         }

         heights[index] = height;
         sumOfHeights = sumOfHeights + heights[index];
     }

     // Calculate mean height
     double meanHeight = sumOfHeights / heights.length;

     // Display mean height
     System.out.println("The mean height of the football team is " + meanHeight);

     // Close the scanner
     input.close();
 }
}

