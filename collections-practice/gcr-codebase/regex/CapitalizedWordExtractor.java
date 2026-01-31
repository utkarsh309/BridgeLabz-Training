package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CapitalizedWordExtractor {

    public static void main(String[] args) {

        String text =
            "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Create Pattern object
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");

        // Create Matcher object
        Matcher matcher = pattern.matcher(text);

        // Extract all capitalized words
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}