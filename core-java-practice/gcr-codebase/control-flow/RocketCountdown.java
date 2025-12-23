// Create RocketCountdown class to count down for rocket launch
import java.util.Scanner;

class RocketCountdown {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create counter variable and take user input
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Close the scanner
        input.close();
    }
}
