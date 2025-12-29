package com.constructors.levelone;

public class CarRental {
	String customerName ;
	String carModel;
	int rentalDays ;
	int costPerday ;
	// Add constructors to initialize the rental details and calculate total cost.
	CarRental(){
		this.customerName = "SUV";
		this.carModel = "Yamaha";
		this.rentalDays= 23 ;
		this.costPerday=4000 ;
	}
	CarRental(String customerName ,String carModel,int rentalDays,int costPerday){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays= rentalDays ;
		this.costPerday=costPerday ;
		
		if (carModel.equalsIgnoreCase("SUV")) {
            costPerday = 2000;
        } else if (carModel.equalsIgnoreCase("Sedan")) {
            costPerday = 1500;
        } else {
            costPerday = 1000;
        }
    }
	int calculateCost() {
		return rentalDays*costPerday;
	}
	void display() {
        System.out.println(
            "Customer: " + customerName +
            ", Car: " + carModel +
            ", Days: " + rentalDays +
            ", Total Cost: ₹" + calculateCost()
        );
    }
	public static void main(String[] args) {
		CarRental r1 = new CarRental();
		CarRental r2 = new CarRental();
		r1.calculateCost();
		r2.display();
	}

}
