package br.com.creational.builder.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class Builder<T> {
  private final T instance;
  private boolean ifCond = true;

  public Builder(Class<T> clazz) {
    try {
      instance = clazz.getDeclaredConstructor().newInstance();

    } catch (InstantiationException
        | IllegalAccessException
        | InvocationTargetException
        | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> Builder<T> build(Class<T> clazz) {
    return new Builder<>(clazz);
  }

  public static <T> Builder<?> builder(Class<T> clazz) {
    return new Builder<T>(clazz);
  }

  public Builder<T> If(BooleanSupplier condition) {
    this.ifCond = condition.getAsBoolean();
    return this;
  }

  public Builder<T> endIf() {
    this.ifCond = true;
    return this;
  }

  public Builder<T> with(Consumer<T> setter) {
    if (ifCond) {
      setter.accept(instance);
    }

    return this;
  }

  public T build() {
    return instance;
  }
}
