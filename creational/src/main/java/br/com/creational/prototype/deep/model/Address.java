package br.com.creational.prototype.deep.model;

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
  public Address clone() throws CloneNotSupportedException {
    return (Address) super.clone();
  }
}
