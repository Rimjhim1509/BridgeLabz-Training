package com.HomeNest;

class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
        energyUsage = 25;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat cooling ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Thermostat reset: temperature set to 24°C");
    }
}
