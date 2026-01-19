package com.HomeNest;

class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        energyUsage = 15;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera turned OFF");
    }

    public void reset() {
        System.out.println("Camera reset: recalibrating lens");
    }
}
