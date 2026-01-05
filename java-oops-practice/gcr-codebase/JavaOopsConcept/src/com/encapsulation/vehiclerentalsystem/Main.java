package com.encapsulation.vehiclerentalsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", 2000));
        vehicles.add(new Bike("B202", 500));
        vehicles.add(new Truck("T303", 4000));

        for (Vehicle v : vehicles) {

            double insurance = 0;

            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
            }

            double total = v.calculateRentalCost(3) + insurance;

            System.out.println(v.getVehicleDetails()
                    + " Total Cost: " + total);
        }
    }
}
