import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take first date input
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate firstDate = LocalDate.parse(input.nextLine());

        // Take second date input
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate secondDate = LocalDate.parse(input.nextLine());

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is BEFORE second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is AFTER second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the SAME.");
        }

        input.close();
    }
}
