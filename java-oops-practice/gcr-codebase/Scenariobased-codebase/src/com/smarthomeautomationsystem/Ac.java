package com.smarthomeautomationsystem;

class Ac extends Appliance {

    Ac() {
        super(1500); // default power
    }

    @Override
    public void turnOn() {
        System.out.println("AC cooling the decoram ...");
    }
}
