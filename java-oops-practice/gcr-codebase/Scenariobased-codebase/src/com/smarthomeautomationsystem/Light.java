package com.smarthomeautomationsystem;

class Light extends Appliance {

    Light() {
        super(10);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is glowing softly");
    }
}
