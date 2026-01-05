package com.encapsulation.vehiclerentalsystem;

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleDetails() {
        return vehicleNumber + " (" + type + ")";
    }

    public abstract double calculateRentalCost(int days);
}
