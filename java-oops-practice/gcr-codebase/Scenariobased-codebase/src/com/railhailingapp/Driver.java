package com.railhailingapp;

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
}
