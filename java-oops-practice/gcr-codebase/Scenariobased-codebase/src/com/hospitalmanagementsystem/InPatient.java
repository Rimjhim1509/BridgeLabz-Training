package com.hospitalmanagementsystem;
//overriding
class InPatient extends Patient {
	private int daysAdmitted;
	InPatient(int id , String name ,String history ,int daysAdmitted){
		super(id , name , history);
		this.daysAdmitted = daysAdmitted ;
		
	}
	void displayInfo() {
		super.displayInfo();
		System.out.print("Patient Type : InPatient");
		System.out.print("Days Admitted : "+ daysAdmitted);
	}
}
