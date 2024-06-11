package br.com.creational.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable {
  private String street;
  private String number;

  public Address() {}

  public Address(String street, String number) {
    this.street = street;
    this.number = number;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Address{" + "street='" + street + '\'' + ", number='" + number + '\'' + '}';
  }

  @Override
  public Address clone() {
    try {
      Address clone = (Address) super.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public static class Builder {
    private String street;
    private String number;

    public Builder(String street, String number) {
      this.street = street;
      this.number = number;
    }

    public Builder withStreet(String street) {
      this.street = street;
      return this;
    }

    public Builder withNumber(String number) {
      this.number = number;
      return this;
    }

    public Address now() {
      return new Address(street, number);
    }
  }
}
