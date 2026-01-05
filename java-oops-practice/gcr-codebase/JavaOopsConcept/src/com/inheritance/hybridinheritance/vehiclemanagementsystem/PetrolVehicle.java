package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int speed) {
        super(model, speed);
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}
