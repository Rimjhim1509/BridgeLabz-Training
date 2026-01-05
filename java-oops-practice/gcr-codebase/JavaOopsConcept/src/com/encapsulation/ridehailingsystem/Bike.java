package com.encapsulation.ridehailingsystem;

class Bike extends Vehicle {

    Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRate() * 0.8; // cheaper
    }
}
