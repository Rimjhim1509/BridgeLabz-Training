package com.generics.universitycoursemanagementsystem;

public class Main {
    public static void main(String[] args) {

        Course<ExamBased> math =
                new Course<>("Mathematics", new ExamBased());

        Course<AssignmentBased> cs =
                new Course<>("Computer Science", new AssignmentBased());

        Course<Researchbased> phd =
                new Course<>("PhD Research", new Researchbased());

        UniversityManager manager = new UniversityManager();
        manager.addCourses(math);
        manager.addCourses(cs);
        manager.addCourses(phd);

        manager.displayCourses();
    }
}
