package br.com.creational.singleton.example2;

public class Client {

  public static void main(String[] args) {
    OrderByComparatorSimplifiedExample instance1 =
        OrderByComparatorSimplifiedExample.getInstance(true);

    OrderByComparatorSimplifiedExample instance2 =
        OrderByComparatorSimplifiedExample.getInstance(false);

    if (isSameInstance(instance1, instance2)) {
      System.out.println(
          "The instances of "
              + OrderByComparatorSimplifiedExample.class.getName()
              + " are the same");
    } else {
      System.out.println(
          "The instances of "
              + OrderByComparatorSimplifiedExample.class.getName()
              + " are not the same");
    }

    OrderByComparatorStringExample instance3 = OrderByComparatorStringExample.getInstance("Joao");

    OrderByComparatorStringExample instance4 = OrderByComparatorStringExample.getInstance("Joao");

    OrderByComparatorStringExample instance5 = OrderByComparatorStringExample.getInstance("Rusbe");

    if (isSameInstance(instance3, instance4)) {
      System.out.println(
          "The instances of " + OrderByComparatorStringExample.class.getName() + " are the same");
    } else {
      System.out.println(
          "The instances of "
              + OrderByComparatorSimplifiedExample.class.getName()
              + " are not the same");
    }

    if (isSameInstance(instance4, instance5)) {
      System.out.println(
          "The instances of " + OrderByComparatorStringExample.class.getName() + " are the same");
    } else {
      System.out.println(
          "The instances of "
              + OrderByComparatorSimplifiedExample.class.getName()
              + " are not the same");
    }
  }

  public static <O1, O2> boolean isSameInstance(O1 obj1, O2 obj2) {
    return obj1 == obj2;
  }
}
