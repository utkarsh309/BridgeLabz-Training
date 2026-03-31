package lambda_expressions;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + " Alert: " + message;
    }
}

public class HospitalNotificationApp {

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("EMERGENCY", "Patient heart rate critical"));
        alerts.add(new Alert("APPOINTMENT", "Doctor visit at 10 AM"));
        alerts.add(new Alert("GENERAL", "Health tips available"));

        // Predicate to filter emergency alerts
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        System.out.println("Filtered Alerts:");

        
        for (Alert alert : alerts) {
            if (emergencyOnly.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}
