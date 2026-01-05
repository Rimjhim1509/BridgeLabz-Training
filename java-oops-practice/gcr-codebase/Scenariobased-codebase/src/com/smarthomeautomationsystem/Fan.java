package com.smarthomeautomationsystem;

class Fan extends Appliance {

    Fan() {
        super(70); 
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }
}
