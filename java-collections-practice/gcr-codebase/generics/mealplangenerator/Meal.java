package com.mealplangenerator;

public class Meal<T extends MealPlan> {
	private T mealPlan ;
	public Meal(T mealPlan) {
		this.mealPlan = mealPlan;
	}
	public void showMeal() {
        System.out.println(mealPlan.getMealDetails());
    }

}
