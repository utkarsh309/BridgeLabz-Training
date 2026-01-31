package regex;

public class BadWordCensor {

    public static void main(String[] args) {

        String input ="This is a damn bad example with some stupid words.";

        // List of bad words
        String regex = "\\b(damn|stupid)\\b";

        // Replace bad words with ****
        String output = input.replaceAll(regex, "****");

        System.out.println(output);
    }
}