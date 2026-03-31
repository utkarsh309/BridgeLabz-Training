
// Create SpringSeason class to check whether a given date falls in Spring Season
public class SpringSeason {

    public static void main(String[] args) {

        // Validate command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments");
            return;
        }

        // Read command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call method to check Spring Season
        boolean isSpring = checkSpringSeason(month, day);

        // Display result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to check if given month and day fall in Spring Season
    public static boolean checkSpringSeason(int month, int day) {

        // Spring Season: March 20 to June 20
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }

        return false;
    }
}
