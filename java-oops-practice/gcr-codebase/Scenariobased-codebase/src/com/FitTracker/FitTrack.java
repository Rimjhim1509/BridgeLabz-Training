package com.FitTracker;

public class FitTrack {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Aman", 22, 70, "Lose Weight");
        user.showProfile();

        Workout w1 = new CardioWorkout(30);
        w1.startWorkout();
        System.out.println("Calories Burned: " + w1.calculateCalories());
        w1.stopWorkout();

        Workout w2 = new StrengthWorkout(40);
        w2.startWorkout();
        System.out.println("Calories Burned: " + w2.calculateCalories());
        w2.stopWorkout();
    }
}
