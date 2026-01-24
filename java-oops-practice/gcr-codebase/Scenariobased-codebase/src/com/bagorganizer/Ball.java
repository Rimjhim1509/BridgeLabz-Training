package com.bagorganizer;



public class Ball {
	private String id;
	private String color;	
	private String size ;
	
	public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

	@Override
	public String toString() {
		return "Ball " + id + " id . and color is "+color  ;
	}

	public String getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	
	
	
}
//Bag-n-Ball Organizer
//OOP Concepts:
//Classes, Objects, Inheritance (optional), Encapsulation, Method Design
//Scenario:
//You’re building a toy storage system for TinyTown Play School, which wants to keep track of
//bags and the balls inside them.
//Each Bag has:

////
//Problem Statement:
//Develop a Java system to:
//● Add balls to a bag (up to capacity)
//● Remove a ball from a bag
//● Display all balls in a bag
//● Display all bags and their ball count
//● Prevent adding a ball if the bag is full
//
//Encapsulate fields, use appropriate getters/setters, and model real-world object
//relations through composition (i.e., Bag "has-a" list of Balls)
//Bonus: Use an interface to define Storable behavior for both Bag and Ball