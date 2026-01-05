package com.encapsulation.ridehailingsystem;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car(101, "Ramesh", 15);
        Vehicle v2 = new Bike(102, "Suresh", 10);

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
    }

    static void calculateRideFare(Vehicle v, double distance) {
        v.getVehicleDetails();
        System.out.println("Fare: " + v.calculateFare(distance));
        System.out.println("-----------");
    }
}
