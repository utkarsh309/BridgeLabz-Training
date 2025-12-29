import java.util.Scanner;

public class LeetCode344ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        char[] result = reverseString(text);

        System.out.print("Reversed String: ");
        System.out.println(result);

        input.close();
    }

    public static char[] reverseString(String s) {

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return chars;
    }
}
