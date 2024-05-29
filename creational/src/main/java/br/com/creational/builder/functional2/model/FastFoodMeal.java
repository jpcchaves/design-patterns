package br.com.creational.builder.functional2.model;

public class FastFoodMeal {
  private final String side;
  private final String drink;
  private final String main;
  private final String dessert;
  private final String gift;

  public FastFoodMeal(String side, String drink, String main, String dessert, String gift) {
    this.side = side;
    this.drink = drink;
    this.main = main;
    this.dessert = dessert;
    this.gift = gift;
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getSide() {
    return side;
  }

  public String getDrink() {
    return drink;
  }

  public String getMain() {
    return main;
  }

  public String getDessert() {
    return dessert;
  }

  public String getGift() {
    return gift;
  }

  @Override
  public String toString() {
    return "FastFoodMeal{"
        + "side='"
        + side
        + '\''
        + ", drink='"
        + drink
        + '\''
        + ", main='"
        + main
        + '\''
        + ", dessert='"
        + dessert
        + '\''
        + ", gift='"
        + gift
        + '\''
        + '}';
  }

  public static class Builder {
    private String side;
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public Builder setSide(String side) {
      this.side = side;
      return this;
    }

    public Builder setDrink(String drink) {
      this.drink = drink;
      return this;
    }

    public Builder setMain(String main) {
      this.main = main;
      return this;
    }

    public Builder setDessert(String dessert) {
      this.dessert = dessert;
      return this;
    }

    public Builder setGift(String gift) {
      this.gift = gift;
      return this;
    }

    public FastFoodMeal build() {
      return new FastFoodMeal(side, drink, main, dessert, gift);
    }
  }
}
