
// Create DisplayCalendar class to print calendar for given month and year
import java.util.Scanner;

public class DisplayCalendar {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Get month name
        String monthName = getMonthName(month);

        // Get number of days in month
        int numberOfDays = getNumberOfDays(month, year);

        // Get first day of month (0=Sun, 1=Mon, ...)
        int firstDay = getFirstDayOfMonth(month, year);

        // Display calendar
        displayCalendar(monthName, year, firstDay, numberOfDays);

        // Close scanner
        input.close();
    }

    // Method to get month name
    public static String getMonthName(int month) {

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {

        int[] daysInMonth = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        // Check leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    // Method to get first day of the month using Gregorian formula
    public static int getFirstDayOfMonth(int month, int year) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(String monthName, int year, int firstDay, int daysInMonth) {

        // Print month and year
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First for loop for indentation
        for (int space = 0; space < firstDay; space++) {
            System.out.print("    ");
        }

        // Second for loop to print days
        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
