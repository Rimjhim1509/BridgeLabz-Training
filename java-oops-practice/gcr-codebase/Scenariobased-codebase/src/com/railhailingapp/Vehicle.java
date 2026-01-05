package com.railhailingapp;

	public class Vehicle {
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	protected double rate;
	Vehicle(String vehicleNumber, int capacity, String type, double rate) {
	    this.vehicleNumber = vehicleNumber;
	    this.capacity = capacity;
	    this.type = type;
	    this.rate = rate;
	}
	public String getType() {
		return type;
	}
}
