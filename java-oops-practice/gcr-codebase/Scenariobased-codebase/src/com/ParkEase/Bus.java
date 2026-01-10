package com.ParkEase;

public class Bus extends Vehicle{
	Bus(String vehicleNumber){
		super(vehicleNumber , 50);
	}
	public double calculateCharges( int hours) {
		return baseRate*hours;
	}
}
