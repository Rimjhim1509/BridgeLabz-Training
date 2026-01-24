package com.generics.universitycoursemanagementsystem;

import java.util.*;
public class UniversityManager {
	private List<Course<? extends CourseType>> courses =new ArrayList<>() ;
	public void addCourses(Course<? extends CourseType> coursetype) {
		courses.add(coursetype);
	}
	public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }

}
