package com.railhailingapp;

class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private double fare;

    RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void bookRide(double distance) {
        fare = 50 + distance * vehicle.rate;   // operators used
        System.out.println("Ride booked with " + vehicle.getType() +
                " driven by " + driver.getName());
        System.out.println("Estimated Fare: " + fare);
    }

    public void endRide() {
        System.out.println("Ride ended. Total Fare: " + fare);
    }
}
