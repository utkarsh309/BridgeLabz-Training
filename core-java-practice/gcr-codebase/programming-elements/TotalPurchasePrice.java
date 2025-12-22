// Create TotalPurchasePrice class to calculate total price of items
import java.util.Scanner;

class TotalPurchasePrice {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity " + quantity +
                " and unit price is INR " + unitPrice
        );

        // Close the scanner
        input.close();
    }
}
