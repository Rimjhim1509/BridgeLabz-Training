package com.ParkEase;

public class ParkEase {
    public static void main(String[] args) {

        Vehicle car = new Car("MH12AB1234");
        ParkingSlot slot1 = new ParkingSlot("S1", "Car");

        ParkingRecord record = new ParkingRecord(car, slot1, 4);
        record.parkVehicle();

        System.out.println("Slot Occupied: " + slot1.isOccupied());
        System.out.println("Parking Charges: ₹" + record.generateBill());

        record.releaseVehicle();
        System.out.println("Slot Occupied After Exit: " + slot1.isOccupied());
    }
}
