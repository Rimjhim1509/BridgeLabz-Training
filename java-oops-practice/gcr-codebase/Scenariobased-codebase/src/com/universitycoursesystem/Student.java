package com.universitycoursesystem;

public class Student {
	protected int studentId;
	protected String name;
	private double gpa;
	Student(int studentId , String name){
		this.studentId = studentId;
		this.name=name;
	}
	public double getGPA() {
		return gpa;
	}
	protected void setGPA(double gpa) {
		this.gpa=gpa;
	}
	public void getTranscript() {
        System.out.println(name + " GPA: " + gpa);
    }
}
