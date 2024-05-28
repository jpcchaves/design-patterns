package br.com.creational.builder.functional;

import br.com.creational.builder.functional.model.FastFoodMeal;
import java.util.logging.Logger;

public class Client {
  private static final Logger _logger = Logger.getLogger(Client.class.getName());

  public static void main(String[] args) {
    FastFoodMeal burgerCombo = new FastFoodMeal.Builder("Fries").andMain("Burger").thatsAll();

    _logger.info(burgerCombo.toString());

    FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();

    _logger.info(justFries.toString());

    FastFoodMeal heartAttackCombo =
        new FastFoodMeal.Builder("Large Fries")
            .andMain("Monster Burger")
            .forDrink("Large Coke")
            .andDessert("Fudge Cake")
            .andGift("2 Kilograms")
            .thatsAll();

    _logger.info(heartAttackCombo.toString());
  }
}
