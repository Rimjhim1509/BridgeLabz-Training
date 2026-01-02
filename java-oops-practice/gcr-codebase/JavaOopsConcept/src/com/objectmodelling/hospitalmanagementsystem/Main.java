package com.objectmodelling.hospitalmanagementsystem;

public class Main {
	public static void main(String[] args) {
		Hospital hospital = new Hospital("City Hospital");
	Doctor d1 = new Doctor("Dr. Sharma");
	Doctor d2 = new Doctor("Dr. Verma");
	
	Patient p1 = new Patient("Ms. Patel");
	Patient p2 = new Patient("Ms. Patidar");
	
	hospital.addDoctor(d1);
	hospital.addDoctor(d2);
	hospital.addPatients(p2);
	hospital.addPatients(p1);
	hospital.getName();
	d1.consult(p2);
	
	}
	

}
