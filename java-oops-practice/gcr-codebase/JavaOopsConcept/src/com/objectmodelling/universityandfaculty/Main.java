package com.objectmodelling.universityandfaculty;

public class Main {
	public static void main(String[] args) {
		University uni = new University("RGPV");
		Departments cs = new Departments("Computer Science");
		Departments mech = new Departments("Mechanical Science");
		
		
		Faculty f2 = new Faculty(2,"Sonakshi");
		
		cs.addFaculty(f2);
		mech.addFaculty(new Faculty(1,"Rajiv"));
		uni.addDepartment(mech);
		uni.addDepartment(cs);
		uni.showDepartments();
		cs.showFaculty();
		mech.showFaculty();
		
	} 
}
