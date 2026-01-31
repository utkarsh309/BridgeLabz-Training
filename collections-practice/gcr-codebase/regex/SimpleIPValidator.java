package regex;

public class SimpleIPValidator {

    public static void main(String[] args) {

        String ip = "192.168.1.1";
        String regex = "^\\d{1,3}(\\.\\d{1,3}){3}$";

        if (ip.matches(regex)) {
            System.out.println("Valid IP format");
        } else {
            System.out.println("Invalid IP format");
        }
    }
}