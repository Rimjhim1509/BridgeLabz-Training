package com.universitycoursesystem;

public class Course {
	int courseId;
	String courseName;
	int credits;
	Course(int courseId,String courseName,int credits){
		this.courseId=courseId;
		this.courseName = courseName;
		this.credits=credits;
	}
}
