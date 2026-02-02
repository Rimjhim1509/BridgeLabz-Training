package com.functionalinterface.smartdevicecontrol;

class Fan implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}
