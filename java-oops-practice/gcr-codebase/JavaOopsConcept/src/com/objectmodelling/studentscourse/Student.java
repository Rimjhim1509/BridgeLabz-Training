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
			course.addStudent(this); 
		}
	}
	public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

	public String getName() {
		return name ;
	}

}
