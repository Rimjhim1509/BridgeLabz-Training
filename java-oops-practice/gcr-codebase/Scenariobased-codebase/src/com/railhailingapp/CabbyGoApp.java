package com.railhailingapp;

public class CabbyGoApp {
    public static void main(String[] args) {

        Vehicle v1 = new Mini("MH12AB1234");
        Driver d1 = new Driver("Ravi", "LIC123", 4.8);

        IRideService ride = new RideService(v1, d1);

        ride.bookRide(12);
        ride.endRide();
    }
}
