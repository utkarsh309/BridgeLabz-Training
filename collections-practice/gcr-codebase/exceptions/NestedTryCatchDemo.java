package exceptions;

public class NestedTryCatchDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int index = 2;   
        int divisor = 0; 

        try {
            // First try: accessing array element
            int value = arr[index];

            try {
                // Inner try: dividing the value
                int result = value / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
