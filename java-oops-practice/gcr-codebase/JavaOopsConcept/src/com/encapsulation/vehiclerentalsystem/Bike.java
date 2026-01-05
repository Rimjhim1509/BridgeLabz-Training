package com.encapsulation.vehiclerentalsystem;

class Bike extends Vehicle {

    Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
	