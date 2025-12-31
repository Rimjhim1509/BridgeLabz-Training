package com.constructors.instancevariable;

public class Vehicle {
	String ownerName ;
	String vehicleType ;
	static  double registrationFee ;
	
	Vehicle(String ownerName , String vehicleType , double registrationFee){
		this.ownerName = ownerName ;
		this.vehicleType = vehicleType;
		this.registrationFee =registrationFee;
	}
	 void displayVehicleDetails() {
		
		System.out.println(ownerName + " owns a " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
	}
	static void updateRegistrationFee(double fee) {
		registrationFee = fee ;
	}

}
class VehicleTest{
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Rahul" , "Car" , 65000) ;
		 v1.displayVehicleDetails();
		 Vehicle.updateRegistrationFee(45000);
		 v1.displayVehicleDetails();
		 
	}
}
