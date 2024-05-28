package br.com.creational.builder.meal;

public class JustFriesBurger extends FastFoodMealBuilder {

  @Override
  public void buildDrink() {}

  @Override
  public void buildMain() {
    meal.setMain("Burger");
  }

  @Override
  public void buildSide() {
    meal.setSide("Large Fries");
  }

  @Override
  public void buildDessert() {}

  @Override
  public void buildGift() {}
}
