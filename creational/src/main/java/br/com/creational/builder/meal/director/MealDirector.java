package br.com.creational.builder.meal.director;

import br.com.creational.builder.meal.FastFoodMeal;
import br.com.creational.builder.meal.FastFoodMealBuilder;

public class MealDirector {
  private FastFoodMealBuilder builder;

  public MealDirector(FastFoodMealBuilder builder) {
    this.builder = builder;
  }

  public void constructCombo() {
    builder.buildDrink();
    builder.buildMain();
    builder.buildSide();
    builder.buildDessert();
    builder.buildGift();
  }

  public FastFoodMeal getCombo() {
    return builder.getMeal();
  }
}
