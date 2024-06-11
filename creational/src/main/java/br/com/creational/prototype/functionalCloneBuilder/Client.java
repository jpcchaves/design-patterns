package br.com.creational.prototype.functionalCloneBuilder;

import br.com.creational.prototype.functionalCloneBuilder.model.Address;
import br.com.creational.prototype.functionalCloneBuilder.model.User;

public class Client {
  public static void main(String[] args) {
    User user = new User("", 255, new Address("Street 1", "234324"));
    User clonedUser = user.cloneBuilder().withName("Cloned++").now();

    System.out.println(user);

    System.out.println(clonedUser);
  }
}
