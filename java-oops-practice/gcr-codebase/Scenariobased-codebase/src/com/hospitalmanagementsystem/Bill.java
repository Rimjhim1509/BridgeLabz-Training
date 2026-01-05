package com.hospitalmanagementsystem;

public class Bill {
//Overloaded for emergency vs. normal patient admission
	private double baseAmount;
	private double taxRate;
	private double discount;
	Bill(double baseAmount , double taxRate , double discount){
		this.baseAmount = baseAmount;
		this.taxRate = taxRate ;
		this.discount = discount;
		
	}
	public double calculatePayment() {
		double tax = baseAmount *taxRate;
		return baseAmount+tax-discount ;
	}
}
