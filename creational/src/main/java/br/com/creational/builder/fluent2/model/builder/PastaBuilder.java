package br.com.creational.builder.fluent2.model.builder;

import br.com.creational.builder.fluent2.model.Pasta;
import br.com.creational.builder.fluent2.model.Size;
import java.util.Arrays;
import java.util.List;

public class PastaBuilder {
  protected final Size size;

  protected List<String> toppings;
  protected List<String> sauces;
  protected boolean cheese;
  protected boolean pepper;

  public PastaBuilder(Size size) {
    this.size = size;
  }

  public PastaBuilder withSauces(String... sauces) {
    this.sauces = Arrays.asList(sauces);
    return this;
  }

  public PastaBuilder withToppings(String... toppings) {
    this.toppings = Arrays.asList(toppings);
    return this;
  }

  public PastaBuilder withCheese() {
    this.cheese = true;
    return this;
  }

  public PastaBuilder withPepper() {
    this.pepper = true;
    return this;
  }

  public Pasta now() {
    return new Pasta(toppings, sauces, size, cheese, pepper);
  }
}
