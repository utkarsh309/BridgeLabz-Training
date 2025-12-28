// Create LeapYearCheck class to check whether a year is a leap year
import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Validate Gregorian calendar year
        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year 1582 or later");
            input.close();
            return;
        }

        // Call method to check leap year
        boolean isLeapYear = checkLeapYear(year);

        // Display result
        if (isLeapYear) {
            System.out.println("The year " + year + " is a Leap Year");
        } else {
            System.out.println("The year " + year + " is not a Leap Year");
        }

        // Close scanner
        input.close();
    }

    // Method to check whether a year is a leap year
    public static boolean checkLeapYear(int year) {

        // Condition:
        // Divisible by 4 and not divisible by 100 OR divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }
}
