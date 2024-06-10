package br.com.creational.prototype.deep;

import br.com.creational.prototype.deep.model.Address;
import br.com.creational.prototype.deep.model.User;

public class Client {
  public static void main(String[] args) throws CloneNotSupportedException {
    User user1 = new User("User 1", 2, new Address("Street user 1", "22"));

    User user2 = user1.clone();

    System.out.println("==== USER 1 ====");
    System.out.println(user1);

    System.out.println("==== USER 2 ====");
    System.out.println(user2);

    user1.getAddress().setStreet("Street user 1 modified");

    System.out.println("==== USERS AFTER MODIFYING THE STREET NAME OF USER 1 ====");
    System.out.println(user1);

    System.out.println("==== USER 2 ====");
    System.out.println(user2);
  }
}
