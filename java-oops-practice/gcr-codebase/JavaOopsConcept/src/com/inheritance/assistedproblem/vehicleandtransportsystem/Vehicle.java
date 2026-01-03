package com.inheritance.assistedproblem.vehicleandtransportsystem;

public class Vehicle {
	int maxSpeed ;
	String fuelType;
	Vehicle(int maxSpeed , String fueltype){
		this.maxSpeed =maxSpeed ;
		this.fuelType = fuelType ;
		
	}
	void display() {
		System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Fuel Type : " + fuelType);
	}

}
