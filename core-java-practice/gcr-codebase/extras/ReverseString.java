//Create class ReverseString to reverse a given string
import java.util.Scanner;
public class ReverseString {
    
    public static void main(String[] args) {
        
        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string to reverse: ");
        String text = input.nextLine();
        String reversed = "";
        // Loop through the string in reverse order
        for (int index = text.length() - 1; index >= 0; index--) {
            // Append each character to the reversed string
            reversed += text.charAt(index);
        }
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        // Close the scanner
        input.close();
    }
}
