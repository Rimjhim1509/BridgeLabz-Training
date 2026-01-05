package com.vehiclerentalapplication;

class Truck extends Vehicle implements Rentable{
	private double loadCharge ;
	Truck(int id , String brand , double rate , double loadCharge){
		super(id,brand,rate);
		this.loadCharge = loadCharge;
	}
	public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }

}
