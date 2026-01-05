package com.encapsulation.ridehailingsystem;

class Car extends Vehicle implements GPS {

    private String location;

    Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRate();
    }

    public void updateLocation(String location) {
        this.location = location;
    }

    public String getCurrentLocation() {
        return location;
    }
}
