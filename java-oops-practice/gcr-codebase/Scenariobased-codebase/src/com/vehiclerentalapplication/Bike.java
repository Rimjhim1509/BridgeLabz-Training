package com.vehiclerentalapplication;
//Inheritance + Polymorphism
class Bike extends Vehicle implements Rentable{
	private double helmetCharge ;
	Bike(int id , String brand , double rate , double helmetCharge){
		super(id,brand,rate);
		this.helmetCharge = helmetCharge;
	}
	public double calculateRent(int days) {
        return (baseRate * days) + helmetCharge;
    }

}
