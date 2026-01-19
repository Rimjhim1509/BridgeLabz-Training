package com.PayXpress;

import java.time.*;
public class ElectricityBill extends Bill {
	public ElectricityBill(double amount , LocalDate dueDate) {
		super("Electricity" , amount , dueDate);
	}
	public void pay() {
		markPaid() ;
		System.out.println("Electricity bill paid");
	}
	public void sendReminder() {
		System.out.println("Reminder bill is due soon ");
	}
}
