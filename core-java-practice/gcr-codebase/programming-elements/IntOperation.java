// Create IntOperation class to perform integer operations
import java.util.Scanner;

class IntOperation {

    public static void main(String[] args) {

        // Create Scanner object to take input 
        Scanner input = new Scanner(System.in);

        // Create variables and take input
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Perform integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display the result
        System.out.println("The results of Int Operations are "+ result1 + ", "+ result2 + ", "
                        + result3 + ", and " + result4
        );

        // Close the scanner
        input.close();
    }
}
