package br.com.creational.builder.fluent2.model;

import java.util.List;

public class Pasta {
  protected final List<String> toppings;
  protected final List<String> sauces;
  protected final Size size;
  protected final boolean cheese;
  protected final boolean pepper;

  public Pasta(
      List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
    this.toppings = toppings;
    this.sauces = sauces;
    this.size = size;
    this.cheese = cheese;
    this.pepper = pepper;
  }

  public List<String> getToppings() {
    return toppings;
  }

  public List<String> getSauces() {
    return sauces;
  }

  public Size getSize() {
    return size;
  }

  public boolean isCheese() {
    return cheese;
  }

  public boolean isPepper() {
    return pepper;
  }

  @Override
  public String toString() {
    return "Pasta{"
        + "toppings="
        + toppings
        + ", sauces="
        + sauces
        + ", size="
        + size
        + ", cheese="
        + cheese
        + ", pepper="
        + pepper
        + '}';
  }
}
