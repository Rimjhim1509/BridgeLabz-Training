package com.bagorganizer;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create bags
        Bag bag1 = new Bag("BAG101", "Red", 2);
        Bag bag2 = new Bag("BAG102", "Blue", 3);

        // Create balls
        Ball ball1 = new Ball("BALL1", "Yellow", "Small");
        Ball ball2 = new Ball("BALL2", "Green", "Medium");
        Ball ball3 = new Ball("BALL3", "Blue", "Large");

        // Add balls
        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); 

        bag2.addBall(ball3);

        // Display balls
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove a ball
        bag1.removeBall("BALL1");

        // Display again
        bag1.displayBalls();

        // Display all bags & counts
        List<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        System.out.println(" Bag Summary:");
        for (Bag bag : bags) {
            System.out.println("Bag ID: " + bag.getId() +
                    ", Ball Count: " + bag.getBallCount());
        }
    }
}
