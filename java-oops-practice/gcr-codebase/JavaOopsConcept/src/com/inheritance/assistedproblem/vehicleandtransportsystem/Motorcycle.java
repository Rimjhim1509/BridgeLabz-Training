package com.inheritance.assistedproblem.vehicleandtransportsystem;

class Motorcycle extends Vehicle {
	
	boolean hasGear ;
	
	Motorcycle(int maxSpeed  , String fuelType , boolean hasGear){
		super(maxSpeed , fuelType);
		this.hasGear =hasGear;
	}
	void display() {
		super.display();
        System.out.println("the vehicle has gear : " + hasGear);
	}
}