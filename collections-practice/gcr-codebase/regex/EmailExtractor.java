package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailExtractor {

    public static void main(String[] args) {

        String text = "Contact us at support@example.com and info@company.org";

        // Create Pattern object
        Pattern pattern = Pattern.compile(
                "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"
        );

        // Create Matcher object
        Matcher matcher = pattern.matcher(text);

        // Extract all email addresses
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}