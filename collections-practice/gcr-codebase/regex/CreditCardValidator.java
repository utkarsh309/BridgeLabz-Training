package regex;

public class CreditCardValidator {

    public static void main(String[] args) {

        String cardNumber = "4123456789012345"; 
        String regex = "^(4|5)\\d{15}$";

        if (cardNumber.matches(regex)) {
            System.out.println("Valid Visa / MasterCard number");
        } else {
            System.out.println("Invalid card number");
        }
    }
}