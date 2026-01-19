package com.PayXpress;

import java.time.LocalDate;
public class WaterBill extends Bill {
	public WaterBill(double amount , LocalDate dueDate) {
		super("Water-Bill" , amount , dueDate);
	}
	public void pay() {
		markPaid() ;
		System.out.println("Water bill paid");
	}
	public void sendReminder() {
		System.out.println("Reminder bill is due soon ");
	}
}
