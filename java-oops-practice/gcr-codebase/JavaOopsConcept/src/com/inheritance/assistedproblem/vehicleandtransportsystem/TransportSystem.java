package com.inheritance.assistedproblem.vehicleandtransportsystem;

public class TransportSystem {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car(20 , "CNG" , 4);
		vehicles[1] = new Truck(40, "Diesel" , 500);
		vehicles[2] = new Motorcycle(20 , "Petrol",true );
		for(Vehicle v : vehicles) {
			System.out.print("----Vehicle Info -----");
			v.display();
		}
	}
}
