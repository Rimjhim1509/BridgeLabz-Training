package com.HomeNest;

public class HomeNestApp {
    public static void main(String[] args) {

        Device d1 = new Light("L101");
        Device d2 = new Camera("C202");

        d1.turnOn();
        d2.turnOn();

        System.out.println("Energy used: " + d1.calculateEnergy(3));
        d1.reset();   // Polymorphism
        d2.reset();
    }
}
