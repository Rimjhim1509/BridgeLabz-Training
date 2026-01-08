package com.CampusConnect;

public class CampusConnect {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "alice@email.com", "S101");
        Student s2 = new Student("Bob", "bob@email.com", "S102");

        Faculty f1 = new Faculty("Dr. Smith", "smith@univ.edu", "F201");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Algorithms");

        f1.assignCourse(c1);
        f1.assignCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.setGrade(c1, 9.0);
        s1.setGrade(c2, 8.5);
        s2.setGrade(c1, 7.5);

        s1.printDetails();
        s2.printDetails();
        f1.printDetails();

       
    }
}
