package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UsernameValidator {

    public static void main(String[] args) {

        String username = "user_123";

        // Create Pattern object
        Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{4,14}$");

        // Create Matcher object
        Matcher matcher = pattern.matcher(username);

        
        if (matcher.matches()) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}