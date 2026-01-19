package com.PayXpress;

import java.time.*;
public class Bill {
	protected String type ;
	protected double amount ;
	//private is used to encapsulation
	private boolean isPaid ;
	protected LocalDate dueDate ;
	
	protected Bill(String type ,double amount ,LocalDate dueDate) {
		this.type = type ;
		this.amount = amount ;
		this.dueDate = dueDate ;
		this.isPaid  = false ;
	}
	protected void markPaid() {
		isPaid = true ; 	
	}
	public boolean isPaid() {
		return isPaid ;
	}
	public double calculateLateFee(double penalty) {
        return amount + penalty;
    }
	

}

