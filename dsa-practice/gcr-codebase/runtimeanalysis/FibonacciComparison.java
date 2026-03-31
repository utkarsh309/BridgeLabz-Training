package runtimeanalysis;

public class FibonacciComparison {

    // Recursive Fibonacci 
    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    // Main Method
    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};  
       

        for (int n : testValues) {

            System.out.println("\nFibonacci Number: " + n);

            // Recursive timing
            long recStart = System.nanoTime();
            int recResult = fibonacciRecursive(n);
            long recEnd = System.nanoTime();

            System.out.println("Recursive Result: " + recResult);
            System.out.println("Recursive Time:   " +(recEnd - recStart) / 1_000_000.0 + " ms");

            // Iterative timing
            long itrStart = System.nanoTime();
            int itrResult = fibonacciIterative(n);
            long itrEnd = System.nanoTime();

            System.out.println("Iterative Result: " + itrResult);
            System.out.println("Iterative Time:   " +(itrEnd - itrStart) / 1_000_000.0 + " ms");
        }
    }
}
