package br.com.creational.builder.meal;

public abstract class FastFoodMealBuilder {
  protected FastFoodMeal meal;

  public FastFoodMealBuilder() {
    this.meal = new FastFoodMeal();
  }

  public abstract void buildDrink();

  public abstract void buildMain();

  public abstract void buildSide();

  public abstract void buildDessert();

  public abstract void buildGift();

  public FastFoodMeal getMeal() {
    return meal;
  }
}
