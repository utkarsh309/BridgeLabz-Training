package scenerioBased;

import java.util.Scanner;

// Create class WageCalculator to compute employee wages
public class WageCalculator {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWorkingHours = 0;
        int totalDays = 0;
        int totalWages = 0;

        // Loop till monthly condition is reached
        while (totalWorkingHours < MAX_WORKING_HOURS && totalDays < MAX_DAYS) {

            // Check employee presence
            boolean isPresent = checkPresence();

            if (isPresent) {

                System.out.println("Employee is Present");
                System.out.println("Enter 1 for Full Time, 2 for Part Time:");
                int choice = input.nextInt();

                int dailyHours = 0;

                switch (choice) {

                    case 1:
                        dailyHours = FULL_TIME_HOURS;
                        System.out.println("Employee is Full Time");
                        break;

                    case 2:
                        dailyHours = PART_TIME_HOURS;
                        System.out.println("Employee is Part Time");
                        break;

                    default:
                        System.out.println("Invalid Choice, Day Skipped");
                        continue;
                }

                // Prevent exceeding max working hours
                if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
                    dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
                }

                int dailyWage = calculateDailyWage(dailyHours);

                totalDays++;
                totalWorkingHours += dailyHours;
                totalWages += dailyWage;

                System.out.println("Daily Wage: " + dailyWage);

            } else {
                System.out.println("Employee is Absent");
            }

            System.out.println();
        }

        // Final Results
        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Monthly Wage: " + totalWages);

        input.close();
    }

    // Method to check employee presence
    public static boolean checkPresence() {
        int value = (int) (Math.random() * 2);
        return value == 1;
    }

    // Method to calculate daily wage
    public static int calculateDailyWage(int workingHours) {
        return workingHours * WAGE_PER_HOUR;
    }
}
