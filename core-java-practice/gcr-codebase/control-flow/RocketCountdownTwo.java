// Create RocketCountdownTwo class to count down for rocket launch using for loop
import java.util.Scanner;

class RocketCountdownTwo {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for starting value
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Close the scanner
        input.close();
    }
}
