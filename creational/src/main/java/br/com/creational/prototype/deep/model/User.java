package br.com.creational.prototype.deep.model;

import java.util.UUID;

public class User implements Cloneable {
  private UUID id = UUID.randomUUID();
  private String name;
  private int age;
  private Address address;

  public User() {}

  public User(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public User(UUID id, String name, int age, Address address) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", age="
        + age
        + ", address="
        + address
        + '}';
  }

  @Override
  public User clone() throws CloneNotSupportedException {
    // Shallow copy
    //    return (User) super.clone();

    // Deep copy
    User clonedUser = (User) super.clone();
    clonedUser.setAddress(address.clone());
    ;

    return clonedUser;
  }
}
