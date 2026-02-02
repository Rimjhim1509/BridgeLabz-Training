package com.functionalinterface.smartdevicecontrol;

class TV implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is cooling the room");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}
