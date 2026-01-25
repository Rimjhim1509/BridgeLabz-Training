package com.mealplangenerator;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealGenerator.generateMeal(new VegetarianMeal());
        vegMeal.showMeal();

        
        Meal<VeganMeal> veganMeal =
                MealGenerator.generateMeal(new VeganMeal());
        veganMeal.showMeal();
    }
}
