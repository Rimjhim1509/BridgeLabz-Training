package com.constructors.instancevariable;

 class Student {
	public int rollNumber ;
	protected String name ;
	private double cgpa ;
	public void setCGPA(double cgpa) {
		this.cgpa = cgpa;
		
	}
	public double getCGPA() {
		return cgpa ;
		
	}
	public static void main(String[] args) {
		PostgraduateStudent pg = new PostgraduateStudent();
		pg.rollNumber  =101 ;
		pg.name = "Rimjhim";
		pg.setCGPA(8.67);
		pg.display();
		System.out.println("CGPA: " + pg.getCGPA());
				
	}
}
class PostgraduateStudent extends Student {
	
	void display() {
		System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
	}
}
