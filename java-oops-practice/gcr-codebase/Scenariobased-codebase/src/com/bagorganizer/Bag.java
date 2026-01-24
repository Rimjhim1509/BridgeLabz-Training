package com.bagorganizer;

import java.util.*;
public class Bag implements Storable {
	private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;
    public Bag(String id,String color,int capacity) {
    	this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
	}
    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }
    
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println(" Bag " + id + " is FULL. Cannot add ball.");
            return;
        }
        balls.add(ball);
        System.out.println(" Ball added to Bag " + id);
    }
    public void removeBall(String ballId) {
        for (Ball ball : balls) {
            if (ball.getId().equals(ballId)) {
                balls.remove(ball);
                System.out.println(" Ball removed from Bag " + id);
                return;
            }
        }
        System.out.println("Ball not found in Bag " + id);
    }

    // 📋 Display balls in bag
    public void displayBalls() {
        System.out.println("Bag ID: " + id + " contains:");
        if (balls.isEmpty()) {
            System.out.println("No balls inside.");
            return;
        }
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
    public int getBallCount() {
        return balls.size();
    }
}
