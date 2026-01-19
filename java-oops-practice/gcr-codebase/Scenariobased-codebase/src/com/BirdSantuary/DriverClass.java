package com.BirdSantuary;

import java.util.*;

public class DriverClass {

    public static void main(String[] args) {

        SanctuaryManager manager = new SanctuaryManager();

        // Adding birds to sanctuary
        manager.addBird(new Eagle("E1", "Rocky"));
        manager.addBird(new Duck("D1", "Daisy"));
        manager.addBird(new Penguin("P1", "Pingu"));
        manager.addBird(new Kiwi("K1", "Kiki"));
        

        System.out.println("Welcome to EcoWing Bird Sanctuary\n");

        // Display all birds
        System.out.println("All Birds Eating:");
        for (Bird b : manager.birds) {
            b.eat();   // polymorphism
        }

        System.out.println("\nFlying Birds:");
        manager.showingBirds();

        System.out.println("\nSanctuary Report:");
        manager.report();
    }
}

