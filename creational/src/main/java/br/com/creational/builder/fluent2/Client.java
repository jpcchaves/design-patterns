package br.com.creational.builder.fluent2;

import br.com.creational.builder.fluent2.model.Pasta;
import br.com.creational.builder.fluent2.model.Size;
import br.com.creational.builder.fluent2.model.builder.PastaBuilder;
import java.util.logging.Logger;

public class Client {
  private static final Logger _logger = Logger.getLogger(Client.class.getName());

  public static void main(String[] args) {
    Pasta p1 = new PastaBuilder(Size.LARGE).now();
    _logger.info(p1.toString());

    Pasta p2 =
        new PastaBuilder(Size.SMALL)
            .withToppings("Bacon", "Broccoli")
            .withSauces("Tomato")
            .withCheese()
            .withPepper()
            .now();

    _logger.info(p2.toString());
  }
}
