package string.level1;

// Create ArrayIndexOutOfBoundsExceptionExample class to generate and handle exception
public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        // Call method that handles the array index out of bounds exception
        handleArrayIndexOutOfBoundsException();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException() {

        // Create an array of size 3
        int[] numbers = {10, 20, 30};

        // Accessing invalid index
        System.out.println(numbers[5]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException() {

        try {
            generateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully");
        }
    }
}
