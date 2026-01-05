package com.hospitalmanagementsystem;

public class Patient {
	private int patientId ;
	private String name ;
	private String medicalHistory ;
	//normal patient
	Patient(int patientId , String name){
		this.patientId = patientId;
		this.name =name;
		this.medicalHistory = "Not provided";
	}
	//emergengy patient(constructor overloading)
	Patient(int patientId , String name,String medicalHistory){
		this.patientId = patientId;
		this.name =name;
		this.medicalHistory = medicalHistory;
	}
	public String  getSummary() {
		return patientId + " " + name ;
	}
	void displayInfo() {
        System.out.println(getSummary());
    }
 
	}
