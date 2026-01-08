package com.FitTracker;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 6;
        return caloriesBurned;
    }
}
