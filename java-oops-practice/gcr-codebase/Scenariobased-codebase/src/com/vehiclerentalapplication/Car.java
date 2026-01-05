package com.vehiclerentalapplication;

class Car extends Vehicle implements Rentable{
	private double luxuryFee ;
	Car(int id , String brand , double rate , double luxuryFee){
		super(id,brand,rate);
		this.luxuryFee = luxuryFee;
	}
	public double calculateRent(int days) {
        return (baseRate * days) + luxuryFee	;
    }

}
