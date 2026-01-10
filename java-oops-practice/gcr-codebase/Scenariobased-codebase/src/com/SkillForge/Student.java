package com.SkillForge;

public class Student extends User {

    private double progress;   // encapsulated

    public Student(String name, String email, int userId) {
        super(name, email, userId);
        this.progress = 0;
    }

    public void updateProgress(double completed, double total) {
        progress = (completed / total) * 100; // operator use
    }

    public double getProgress() {
        return progress;
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + ", Progress: " + progress + "%");
    }
}
