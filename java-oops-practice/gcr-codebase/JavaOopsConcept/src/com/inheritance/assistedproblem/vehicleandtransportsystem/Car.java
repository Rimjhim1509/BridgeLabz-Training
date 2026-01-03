package com.inheritance.assistedproblem.vehicleandtransportsystem;

class Car extends Vehicle {
	int seatCapacity ;
	Car(int maxSpeed  , String fuelType , int seatCapacity){
		super(maxSpeed , fuelType);
		this.seatCapacity =seatCapacity;
	}
	void display() {
		super.display();
        System.out.println("Seat Capacity : " + seatCapacity);
	}
}