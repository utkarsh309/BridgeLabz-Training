import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take date input from user
        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateInput = input.nextLine();

        // Convert string input to LocalDate
        LocalDate date = LocalDate.parse(dateInput);

        System.out.println("Original Date: " + date);

        // Add 7 days
        date = date.plusDays(7);

        // Add 1 month
        date = date.plusMonths(1);

        // Add 2 years
        date = date.plusYears(2);

        // Subtract 3 weeks
        date = date.minusWeeks(3);

        // Display final date
        System.out.println("Final Date after calculations: " + date);

        input.close();
    }
}
