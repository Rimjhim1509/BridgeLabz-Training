package com.PetPal;
import java.util.*;
public abstract class Pet implements IInteractable{
	//Base for all child class 
	protected String name;
    protected String type;
    protected int age;

    private int hunger;   // encapsulated
    private int energy;
    private int mood;
    
    public Pet(String name , String type, int age) {
    	this.name =name;
    	this.type = type;
    	this.age = age;
    	
    	Random r =new Random();
    	this.hunger = r.nextInt(50) + 30;
    	this.energy = r.nextInt(50) + 30;
    	this.mood = r.nextInt(50) + 30;
    }
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }
    public void feed() {
        hunger -= 10;      // operator usage
        energy += 5;
        mood += 5;
        normalize();
        System.out.println(name + " has been fed.");
    }

    @Override
    public void play() {
        hunger += 5;
        energy -= 10;
        mood += 10;
        normalize();
        System.out.println(name + " enjoyed playing!");
    }

    @Override
    public void sleep() {
        energy += 15;
        hunger += 5;
        normalize();
        System.out.println(name + " is sleeping.");
    }
    private void normalize() {
        hunger = Math.max(0, Math.min(100, hunger));
        energy = Math.max(0, Math.min(100, energy));
        mood = Math.max(0, Math.min(100, mood));
    }

    public void showStatus() {
        System.out.println(
            name + " | Hunger: " + hunger +
            " | Energy: " + energy +
            " | Mood: " + mood
        );
    }
    public abstract void makeSound();

}
