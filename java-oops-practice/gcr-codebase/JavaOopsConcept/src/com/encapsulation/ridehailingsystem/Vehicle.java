package com.encapsulation.ridehailingsystem;

abstract class Vehicle {

    protected int vehicleId;
    protected String driverName;

    private double ratePerKm;

    Vehicle(int id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId +
                           ", Driver: " + driverName);
    }

    protected double getRate() {
        return ratePerKm;
    }
}
