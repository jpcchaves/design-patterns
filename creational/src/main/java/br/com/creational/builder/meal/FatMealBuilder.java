package br.com.creational.builder.meal;

public class FatMealBuilder extends FastFoodMealBuilder {

  @Override
  public void buildDrink() {
    meal.setDrink("Milkshake");
  }

  @Override
  public void buildMain() {
    meal.setMain("TripleCheddarBaconBurger");
  }

  @Override
  public void buildSide() {
    meal.setSide("Onion Rings");
  }

  @Override
  public void buildDessert() {
    meal.setDessert("Large IceCream");
  }

  @Override
  public void buildGift() {
    meal.setGift("Pass to hospital...");
  }
}
