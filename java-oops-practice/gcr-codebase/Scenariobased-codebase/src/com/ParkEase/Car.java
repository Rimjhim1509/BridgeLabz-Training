package com.ParkEase;

public class Car extends Vehicle{
	Car(String vehicleNumber){
		super(vehicleNumber , 120);
	}
	public double calculateCharges( int hours) {
		return baseRate*hours;
	}
}
