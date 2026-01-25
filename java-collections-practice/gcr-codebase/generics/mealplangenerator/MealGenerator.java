package com.mealplangenerator;

public class MealGenerator {
	public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan){
		System.out.println("Validating meal plan...");
        return new Meal<>(mealPlan);

	}
}
