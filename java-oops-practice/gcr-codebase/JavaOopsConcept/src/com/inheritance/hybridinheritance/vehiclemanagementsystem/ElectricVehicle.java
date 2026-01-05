package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int speed) {
        super(model, speed);
    }

    void charge() {
        System.out.println("Charging electric vehicle");
    }
}
