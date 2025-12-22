// Create StudentFeeDiscount class to calculate discounted fee
import java.util.Scanner;

class StudentFeeDiscount {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store course fee and take input from the user
        double fee = input.nextInt();

        // Create variable to store discount percentage and take input from the user
        double discountPercent = input.nextInt();

        // Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;

        // Calculate final discounted fee
        double finalDiscountedFee = fee - discountAmount;

        // Display the result
        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalDiscountedFee
        );

        // Close the scanner
        input.close();
    }
}
