package com.SkillForge;

import java.util.*;

public class SkillForge {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Rahul", "rahul@sf.com", 101);
        Student stu = new Student("Ananya", "ananya@sf.com", 201);

        List<String> modules = Arrays.asList(
                "Java Basics", "OOP", "Collections", "Spring");

        Course course = new Course(
                "Java Developer Track", inst, "Advanced", modules);

        stu.updateProgress(3, 4); // completed / total
        stu.printDetails();

        course.generateCertificate();
        System.out.println("Course Rating: " + course.getRating());
    }
}
