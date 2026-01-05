package com.universitycoursesystem;

class Undergraduate extends Student{
	Undergraduate(int id ,String name){
		super(id,name);
	}
	public void calculateGPA(double[] marks) {
		double sum =0;
		for(double m : marks) {
			sum+=m;
		}
		setGPA(sum/marks.length);
	}
}
