package com.vehiclerentalapplication;

class Customer {
	private int customerId;
	private String name;
	Customer(int customerId,String name){
		this.customerId=customerId;
		this.name=name;
	}
    public String getCustomerInfo() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}
