package br.com.creational.builder.fluent;

import br.com.creational.builder.fluent.model.FastFoodMeal;
import br.com.creational.builder.fluent.model.builder.FastFoodMealBuilder;
import java.util.logging.Logger;

public class Client {
  private static final Logger _logger = Logger.getLogger(Client.class.getName());

  public static void main(String[] args) {
    FastFoodMeal burgerCombo =
        new FastFoodMealBuilder("Fries").addMain("CheeseBurger").forDrink("Coke").thatsAll();

    _logger.info(burgerCombo.toString());

    FastFoodMeal fries = new FastFoodMealBuilder("Fries").thatsAll();

    _logger.info(fries.toString());

    FastFoodMeal heartAttackCombo =
        new FastFoodMealBuilder("Large Fries")
            .addMain("Monster Burger")
            .forDrink("Large Coke")
            .addDessert("Milk Shake")
            .andGift("Pass to hospital")
            .thatsAll();

    _logger.info(heartAttackCombo.toString());
  }
}
