package br.com.creational.singleton.example2;

import java.util.Objects;

public class OrderByComparatorStringExample {
  private static OrderByComparatorStringExample _INSTANCE = null;
  private final String name;

  private OrderByComparatorStringExample(String name) {
    this.name = name;
  }

  public static OrderByComparatorStringExample getInstance(String name) {
    if (Objects.isNull(name) || name.isEmpty()) {
      throw new RuntimeException("Name cannot be blank");
    }

    if (_INSTANCE != null) {
      return _INSTANCE;
    }

    _INSTANCE = new OrderByComparatorStringExample(name);
    return _INSTANCE;
  }
}
