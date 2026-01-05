package com.universitycoursesystem;

class Postgraduate extends Student{
	Postgraduate(int id ,String name){
		super(id,name);
	}
	public void calculateGPA(double[] marks) {
		double sum =0;
		for(double m : marks) {
			sum+=(m * 1.1);
		}
		setGPA(sum/marks.length);
	}
}
