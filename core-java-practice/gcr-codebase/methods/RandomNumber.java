import java.util.Scanner;

// Create RandomNumber class
public class RandomNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Size of array (5 random numbers)
        int size = 5;

        // Generate 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Display generated numbers
        System.out.println("Generated 4-digit numbers:");
        for (int index = 0; index < randomNumbers.length; index++) {
            System.out.println(randomNumbers[index]);
        }

        // Find average, min and max
        double[] result = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("\nAverage = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);

        // Close scanner
        input.close();
    }

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {

            // Generates random number between 1000 and 9999
            numbers[index] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int index = 0; index < numbers.length; index++) {

            sum = sum + numbers[index];
            min = Math.min(min, numbers[index]);
            max = Math.max(max, numbers[index]);
        }

        double average = (double) sum / numbers.length;

        return new double[] { average, min, max };
    }
}
