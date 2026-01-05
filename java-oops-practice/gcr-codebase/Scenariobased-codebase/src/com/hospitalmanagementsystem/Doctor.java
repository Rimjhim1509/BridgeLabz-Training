package com.hospitalmanagementsystem;

public class Doctor {
	private int doctorId ;
	private String name ;
	private String specialization ;
	Doctor(int doctorId , String name , String specialization){
		this.doctorId = doctorId ;
		this.name = name ;
		this.specialization = specialization;
	}
		void displayInfo() {
	        System.out.println("Doctor ID: " + doctorId);
	        System.out.println("Doctor Name: " + name);
	        System.out.println("Specialization: " + specialization);
	    

	}
}
