package string.level1;

// Create NullPointerExceptionExample class to generate and handle exception
public class NullPointerExceptionExample {

    public static void main(String[] args) {

        // Call method that handles the null pointer exception
        handleNullPointerException();
        
        
    }

    // Method to generate NullPointerException
    public static void generateNullPointerException() {

        String text = null;

        // Attempting to call a method on a null reference
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {

        try {
            generateNullPointerException();
        } catch (NullPointerException exception) {
            System.out.println("Null pointer exception handled successfully");
        }
    }
}
