package com.constructors.levelone;

public class Circle {
	 int radius;
	// 1st constructor (default)
    Circle() {
        this(12);  // calls 3rd constructor
        System.out.println("Default constructor called");
    }

    // 3rd constructor (main initializer)
    Circle(int radius) {
        this.radius = radius;
        
        System.out.println(radius);
    }
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args) {
    	Circle c1 =new Circle();
    c1.displayRadius();
    }
    
}
