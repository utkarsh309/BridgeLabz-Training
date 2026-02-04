package functional_interface;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int maxLength = 20;
        String message = "Welcome to Java Programming";

        // Function to get length of a string
        Function<String, Integer> lengthFunction = msg -> msg.length();

        int messageLength = lengthFunction.apply(message);

        if (messageLength > maxLength) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message is within the character limit.");
        }

        System.out.println("Message length: " + messageLength);
    }
}
