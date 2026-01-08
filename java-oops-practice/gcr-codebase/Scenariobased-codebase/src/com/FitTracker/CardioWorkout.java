package com.FitTracker;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 8; // operator usage
        return caloriesBurned;
    }
}
