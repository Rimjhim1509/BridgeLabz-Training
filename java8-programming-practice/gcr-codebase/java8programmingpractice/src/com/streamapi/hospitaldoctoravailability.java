package com.streamapi;

import java.util.List;

class Doctor{
	String name;
	String speciality ;
	boolean availableOnWeekends ;
	public Doctor(String name , String speciality,boolean availableOnWeekends) {
		this.name =name;
		this.speciality = speciality;
		this.availableOnWeekends = availableOnWeekends ;
	}
}
public class hospitaldoctoravailability {
	public static void main(String[] args) {
		List<Doctor> doctors = List.of(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedic", true),
                new Doctor("Dr. D", "Dermatology", true),
                new Doctor("Dr. E", "Cardiology", false)
        );
		doctors.stream().filter(d -> d.availableOnWeekends).sorted((d1, d2)-> d1.speciality.compareTo(d2.speciality))
		.forEach(n -> System.out.println(n.name + " "+ n.speciality));
	}
}
