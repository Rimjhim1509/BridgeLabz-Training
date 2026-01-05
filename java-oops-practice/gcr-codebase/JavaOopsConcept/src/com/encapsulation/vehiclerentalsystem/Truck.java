package com.encapsulation.vehiclerentalsystem;

 class Truck extends Vehicle implements Insurable {

    Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days + 1000;
    }

    public double calculateInsurance() {
        return 1500;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Active";
    }
}
