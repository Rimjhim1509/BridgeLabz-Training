package com.universitycoursesystem;

class Enrollment implements Graded {
	private double grade;
	private String semester;
	
	Enrollment(String semester){
		this.semester=semester;
	}
	public void assignGrade(double marks) {
		if(marks >40) {
			grade=1;
		}
		else {
			grade =0;
		} 
	}
	public double  getGrade() {
		return grade;
	}
}
