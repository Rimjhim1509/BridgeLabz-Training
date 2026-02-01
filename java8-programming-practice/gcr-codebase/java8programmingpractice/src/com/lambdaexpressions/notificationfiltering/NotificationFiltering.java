package com.lambdaexpressions.notificationfiltering;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;   // EMERGENCY, MEDICINE, GENERAL

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

public class NotificationFiltering {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate critical", "EMERGENCY"),
                new Alert("Time to take medicine", "MEDICINE"),
                new Alert("Doctor appointment reminder", "GENERAL"),
                new Alert("BP very high", "EMERGENCY")
        );

        // Predicate using lambda
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        Predicate<Alert> medicineOnly =
                alert -> alert.type.equals("MEDICINE");

        // User preference: Emergency OR Medicine alerts
        Predicate<Alert> userPreference =
                emergencyOnly.or(medicineOnly);

        // Filtering alerts
        alerts.stream()
              .filter(userPreference)
              .forEach(a -> System.out.println(a.message));
    }
}
