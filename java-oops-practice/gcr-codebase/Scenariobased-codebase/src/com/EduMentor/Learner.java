package com.EduMentor;

public class Learner extends User implements ICertifiable {

    private boolean fullTimeCourse;

    public Learner(String name, String email, String userId, boolean fullTimeCourse) {
        super(name, email, userId);
        this.fullTimeCourse = fullTimeCourse;
    }

    @Override
    public void generateCertificate() {
        if (fullTimeCourse)
            System.out.println("Full-Time Course Completion Certificate issued to " + name);
        else
            System.out.println("Short Course Certificate issued to " + name);
    }

    @Override
    public void printDetails() {
        System.out.println("Learner: " + name + ", Email: " + email);
    }
}
