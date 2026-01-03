package com.inheritance.assistedproblem.vehicleandtransportsystem;

class Truck extends Vehicle {
	int loadCapacity ;
	Truck(int maxSpeed  , String fuelType , int loadCapacity){
		super(maxSpeed , fuelType);
		this.loadCapacity =loadCapacity;
	}
	void display() {
		super.display();
        System.out.println("Load Capacity : " + loadCapacity);
	}
}