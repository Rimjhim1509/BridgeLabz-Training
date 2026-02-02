package com.functionalinterface.multivehiclerentalsystem;

public class Main {
	public static void main(String[] args) {
		RentalVehicle bus = new Bus();
	RentalVehicle car = new Car();
	RentalVehicle bike = new Bike();
	
	bus.rent();
	car.rent();
	bike.rent();
	
	bus.returnVehicle();
	car.returnVehicle();
	bike.returnVehicle();
	}
	
	
}
