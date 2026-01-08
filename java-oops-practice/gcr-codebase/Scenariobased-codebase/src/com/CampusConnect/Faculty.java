package com.CampusConnect;
import java.util.*;
class Faculty extends Person {
    private List<Course> assignedCourses;

    public Faculty(String name, String email, String id) {
        super(name, email, id);
        assignedCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setFaculty(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty: " + name + " | Email: " + email + " | ID: " + id);
        System.out.println("Courses Teaching: ");
        for (Course c : assignedCourses) System.out.println(" - " + c.getCourseName());
    }
}

