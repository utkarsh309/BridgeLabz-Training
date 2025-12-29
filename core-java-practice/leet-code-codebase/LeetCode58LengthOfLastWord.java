import java.util.Scanner;

public class LeetCode58LengthOfLastWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        int result = lengthOfLastWord(sentence);

        System.out.println("Length of Last Word: " + result);

        input.close();
    }

    public static int lengthOfLastWord(String s) {

        int length = 0;
        int index = s.length() - 1;

        // Skip trailing spaces
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // Count characters of last word
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }
}
