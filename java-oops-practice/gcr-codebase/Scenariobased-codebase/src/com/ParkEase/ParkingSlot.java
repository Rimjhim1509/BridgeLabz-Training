package com.ParkEase;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // Constructor with slotId and vehicle type
    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Encapsulated slot availability
    protected void occupySlot() {
        isOccupied = true;
    }

    protected void freeSlot() {
        isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getSlotId() {
        return slotId;
    }
}
