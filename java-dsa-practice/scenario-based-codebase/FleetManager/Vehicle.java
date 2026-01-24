package com.FleetManager;

public class Vehicle {
	private String vehicleid;
	private int mileage;
	public Vehicle(String vehicleid ,int mileage) {
		this.vehicleid =vehicleid;
		this.mileage=mileage ;
	}
	public String getvehicleid() {
		return vehicleid ;
	}
	public int getMileage() {
		return mileage ;
	}
	
	public String toString() {
		return "Vehicle having id "+ vehicleid + " mileage "+ mileage +" km.";
	}
}
