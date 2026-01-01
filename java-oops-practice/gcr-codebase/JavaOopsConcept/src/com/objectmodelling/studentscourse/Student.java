package com.objectmodelling.studentscourse;
import java.util.*;
public class Student {
	 int id ;
	private String name;
	private List<Course> courses ;
	
	public Student(int id , String name) {
		this.id = id ;
		this.name = name;
		this.courses = new ArrayList<>();
	}
	public void enrollCourse(Course course) {
		if(!courses.contains(course)) {
			courses.add(course);
		}
	}
	public String getName() {
		return name ;
	}

}
