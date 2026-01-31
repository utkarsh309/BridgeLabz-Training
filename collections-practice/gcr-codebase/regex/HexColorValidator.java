package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HexColorValidator {

    public static void main(String[] args) {

        String colorCode = "#FFA500";

        // Create Pattern object
        Pattern pattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");

        // Create Matcher object
        Matcher matcher = pattern.matcher(colorCode);

        if (matcher.matches()) {
            System.out.println("Valid Hex Color Code");
        } else {
            System.out.println("Invalid Hex Color Code");
        }
    }
}