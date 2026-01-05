package com.vehiclerentalapplication;

public class Main {
	public static void main(String[] args){
		Customer c1 =new Customer(1,"Ravi");
		Rentable v1 =new Bike(101,"Hero",300,50);
		Rentable v2 =new Car(102,"Honda",1500,200);
		Rentable v3 =new Truck(103,"tata",3200,500);

		System.out.println(c1.getCustomerInfo());

        System.out.println("Bike Rent (3 days): " + v1.calculateRent(3));
        System.out.println("Car Rent (3 days): " + v2.calculateRent(3));
        System.out.println("Truck Rent (3 days): " + v3.calculateRent(3));

	}
}
