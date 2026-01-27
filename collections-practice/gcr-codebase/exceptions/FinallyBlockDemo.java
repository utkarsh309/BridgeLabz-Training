package exceptions;

import java.util.Scanner;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Operation completed");
            input.close();
        }
    }
}
