package com.vehiclerentalapplication;

public class Vehicle {
	protected int vehicleId;
	protected String brand;
	protected double baseRate;
	Vehicle(int vehicleId ,String brand ,double baseRate){
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.baseRate = baseRate;
	}
	public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }	
}

