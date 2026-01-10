package com.PetPal;

public class PetPalApp {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Sunny", 1);

        dog.showStatus();
        dog.makeSound();
        dog.play();
        dog.feed();
        dog.showStatus();

        System.out.println();

        cat.showStatus();
        cat.makeSound();
        cat.sleep();
        cat.showStatus();

        System.out.println();

        bird.showStatus();
        bird.makeSound();
        bird.play();
        bird.showStatus();
    }
}
