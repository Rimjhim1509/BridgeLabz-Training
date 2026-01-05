package com.universitycoursesystem;

class Faculty implements Graded {
	public void assignGrade(double marks) {
		if(marks>90) {
			System.out.println("Grade: A");
		}else if(marks >=75) {
			System.out.println("Grade: B");
		}else {
			System.out.println("Grade: C");
		}
	}

}
