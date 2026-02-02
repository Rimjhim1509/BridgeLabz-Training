package com.functionalinterface.smartdevicecontrol;

public class Main {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new Fan();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        tv.turnOff();
    }
}
