package br.com.creational.builder.mineexample;

import java.util.logging.Logger;

public class Main {

  private static final Logger _logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    ExampleBuilder1 builder1 =
        new ExampleBuilder1.builder()
            .setId(1L)
            .setName("Custom Name")
            .setDescription("Description of this item here")
            .build();

    _logger.info(builder1.toString());
  }
}
