package br.com.creational.builder.functional2;

import br.com.creational.builder.functional2.model.FastFoodMeal;

public class Client {
  public static void main(String[] args) {
    FastFoodMeal meal = FastFoodMeal.builder().setDessert("Arroz doce").build();
    FastFoodMeal meal2 =
        FastFoodMeal.builder()
            .setDessert("Pudim")
            .setMain("Parmegiana")
            .setDrink("Vinho")
            .setGift("The meal is for free")
            .build();

    System.out.println(meal);
    System.out.println(meal2);
  }
}
