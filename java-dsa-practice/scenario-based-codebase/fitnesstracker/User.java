package com.fitnesstracker;

public class User {
	private String name ;
	private int steps;
	public User(String name,int steps) {
		
		this.name=name;
		this.steps=steps;
	}
	public String getName() {
		return name;
	}
	public int getSteps() {
		return steps;
	}
	@Override
    public String toString() {
        return "User: " + name + ", Steps: " + steps;
    }
}
