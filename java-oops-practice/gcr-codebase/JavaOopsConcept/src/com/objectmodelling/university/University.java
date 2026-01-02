package com.objectmodelling.university;
import java.util.*;
public class University {
	

	
	    private String name;
	    private List<Student> students;
	    private List<Proffesor> professors;
	    private List<Course> courses;

	    public University(String name) {
	        this.name = name;
	        students = new ArrayList<>();
	        professors = new ArrayList<>();
	        courses = new ArrayList<>();
	    }

	    public void addStudent(Student s) {
	        students.add(s);
	    }

	    public void addProffesor(Proffesor p) {
	        professors.add(p);
	    }

	    public void addCourse(Course c) {
	        courses.add(c);
	    }
}


