package com.objectmodelling.hospitalmanagementsystem;

import java.util.*;

public class Hospital {
	private String name ;
	private List<Doctor> doctors ;
	private List<Patient> patients ;
	public Hospital(String name) {
		this.name =name;
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
		
	}
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public void addPatients(Patient p) {
		patients.add(p);
	}
	public String getName(){
		return name;
	}
}
