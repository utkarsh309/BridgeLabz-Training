package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LicensePlateValidator {

    public static void main(String[] args) {

        String plateNumber = "AB1234";

        // Create Pattern object
        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{4}$");

        // Create Matcher object
        Matcher matcher = pattern.matcher(plateNumber);

        if (matcher.matches()) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }
    }
}