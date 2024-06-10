package br.com.creational.prototype.shallow;

import br.com.creational.prototype.shallow.model.Person;

public class Client {
  public static void main(String[] args) {
    Person person = new Person();

    try {
      Person person2 = (Person) person.clone();

      System.out.println(person);

      System.out.println("=============");

      System.out.println(person2);

    } catch (CloneNotSupportedException ex) {
      ex.printStackTrace();
    }
  }
}
