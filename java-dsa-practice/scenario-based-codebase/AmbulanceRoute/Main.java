package com.AmbulanceRoute;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", false);
        route.addUnit("ICU", true);

        route.displayUnits();

        route.redirectPatient();     // ICU

        route.removeUnit("Radiology");

        route.displayUnits();

        route.redirectPatient();     // ICU again
    }
}
