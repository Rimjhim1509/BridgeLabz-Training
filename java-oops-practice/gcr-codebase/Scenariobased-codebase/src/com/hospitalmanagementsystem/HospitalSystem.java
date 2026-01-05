package com.hospitalmanagementsystem;

public class HospitalSystem {
	public static void main(String[] args ) {
		Patient p1 = new InPatient(101 , "Ravi","Diabetes",5);
		Patient p2 = new OutPatient(102, "Anita", "25-Aug-2026");

        Doctor doctor = new Doctor(201, "Dr. Mehta", "Cardiology");

        Bill bill = new Bill(12000, 0.18, 1000);

        System.out.println("---- Patient Details ----");
        p1.displayInfo();
        
        p2.displayInfo();

        System.out.println("--- Doctor Details ----");
        doctor.displayInfo();

        System.out.println("--- Billing ----");
        System.out.println("Total Payable Amount: ₹" + bill.calculatePayment());

	}
}
