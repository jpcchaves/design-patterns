package br.com.creational.singleton.example2;

public class OrderByComparatorSimplifiedExample {
  private static final OrderByComparatorSimplifiedExample _INSTANCE_TRUE =
      new OrderByComparatorSimplifiedExample(true);
  private static final OrderByComparatorSimplifiedExample _INSTANCE_FALSE =
      new OrderByComparatorSimplifiedExample(false);
  private final boolean ascending;

  private OrderByComparatorSimplifiedExample(boolean ascending) {
    this.ascending = ascending;
  }

  public static OrderByComparatorSimplifiedExample getInstance(boolean ascending) {
    if (ascending) {
      return _INSTANCE_TRUE;
    } else return _INSTANCE_FALSE;
  }

  public boolean isAscending() {
    return ascending;
  }

  @Override
  public String toString() {
    return "OrderByComparatorSimplifiedExample{" + "ascending=" + ascending + '}';
  }
}
