package com.HomeNest;

abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;        // Encapsulated
    protected double energyUsage;

    protected Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateEnergy(double hours) {
        return energyUsage * hours;
    }

    protected void logFirmwareUpdate() {
        System.out.println("Firmware updated for device: " + deviceId);
    }
}
