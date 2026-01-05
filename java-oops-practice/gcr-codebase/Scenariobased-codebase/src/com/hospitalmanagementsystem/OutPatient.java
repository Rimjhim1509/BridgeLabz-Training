package com.hospitalmanagementsystem;

class OutPatient extends Patient{
	private String appointDate ;
	OutPatient(int id , String name , String appointDate){
		super(id , name);
		this.appointDate = appointDate;
	}
		void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type: OutPatient");
        System.out.println("Appointment Date: " + appointDate);
	   
	}
}
