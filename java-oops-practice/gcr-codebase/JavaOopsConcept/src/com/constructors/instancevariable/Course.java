package com.constructors.instancevariable;

public class Course {
	String courseName ;
	int duration;
	double fee ;
	static String institute = "Aiims" ;
	
	Course(String courseName , int duration , double fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		
	}
	void displayCourseDetail() {
		System.out.println(courseName + " | "+ duration + " | "+ fee);
		System.out.println("Institute "+ institute);
	}
	static void updateInstituteName(String name) {
		institute = name ;
	}
	 
}
class CourseTest {
	public static void main(String[] args) {
		Course c1 = new Course("Java" , 6 , 30000 );
		c1.displayCourseDetail();
		Course.updateInstituteName("OpenAcademy");
		c1.displayCourseDetail();
	}
}
