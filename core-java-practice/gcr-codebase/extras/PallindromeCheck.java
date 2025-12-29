//Create class PallindromeCheck to check if a string is a palindrome
import java.util.Scanner;
public class PallindromeCheck {
    
    public static void main(String[] args) {
        
        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Take input string from the user
        System.out.print("Enter a string to check for palindrome: ");
        String text = input.nextLine();

        int left = 0;
        int right = text.length() - 1;

        //loop to check characters from both ends
        while(left < right) {
            if(text.charAt(left) != text.charAt(right)) {
                System.out.println("The string is not a palindrome.");
                input.close();
                return;
            }
            left++;
            right--;
        }
        System.out.println("The string is a palindrome.");
        // Close the scanner
        input.close();
    }
}
