package com.encapsulation.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {

    Car(String num, double rate) {
        super(num, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Active";
    }

	
}
