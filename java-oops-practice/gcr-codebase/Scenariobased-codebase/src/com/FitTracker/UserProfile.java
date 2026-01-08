package com.FitTracker;

public class UserProfile {

    private String name;
    private int age;
    private double weight; // protected health data
    private String goal;

    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public double getWeight() {
        return weight;
    }

    public void showProfile() {
        System.out.println(name + " | Goal: " + goal);
    }
}
