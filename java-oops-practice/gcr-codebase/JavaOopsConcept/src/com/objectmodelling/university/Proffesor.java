package com.objectmodelling.university;
import java.util.*;
public class Proffesor {
	private int id;
    private String name;
    private List<Course> courses;
    
    public Proffesor(int id , String name) {
    	this.id = id;
    	this.name =name;
    	this.courses = new ArrayList<>();
    	
    }
    public void assignCourse(Course course) {
    	if(!courses.contains(course)) {
    		courses.add(course);
    		course.assignProfessor(this);
    		
    	}
    }
    public String getName() {
    	return name;
    }
}
