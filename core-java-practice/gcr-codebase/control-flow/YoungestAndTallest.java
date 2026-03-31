package controlFlow;
//Create YoungestAndTallest class to find the youngest and tallest friend

import java.util.Scanner;
public class YoungestAndTallest {

	public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take age inputs
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Take height inputs
        int amarHeight = input.nextInt();
        int akbarHeight = input.nextInt();
        int anthonyHeight = input.nextInt();

        // Find youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest friend");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest friend");
        } else {
            System.out.println("Anthony is the youngest friend");
        }

        // Find tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest friend");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest friend");
        } else {
            System.out.println("Anthony is the tallest friend");
        }

        // Close the scanner
        input.close();
    }
}
