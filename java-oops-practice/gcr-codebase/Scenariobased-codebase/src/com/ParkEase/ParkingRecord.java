package com.ParkEase;

public class ParkingRecord {

    private Vehicle vehicle;
    private ParkingSlot slot;
    private int hours;

    public ParkingRecord(Vehicle vehicle, ParkingSlot slot, int hours) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.hours = hours;
    }

    public double generateBill() {
        return vehicle.calculateCharges(hours);
    }

    protected void parkVehicle() {
        slot.occupySlot();
    }

    protected void releaseVehicle() {
        slot.freeSlot();
    }
}
