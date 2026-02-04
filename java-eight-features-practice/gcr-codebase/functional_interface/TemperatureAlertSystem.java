package functional_interface;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 40.0;
        double currentTemperature = 45.5;

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isAlert = temp -> temp > threshold;

        // Check temperature
        if (isAlert.test(currentTemperature)) {
            System.out.println("ALERT! Temperature crossed the threshold.");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
