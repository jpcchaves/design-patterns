package br.com.creational.builder.generic2;

import br.com.creational.builder.generic2.model.GenericBuilder;
import br.com.creational.builder.generic2.model.Person;

public class Client {

  public static void main(String[] args) {

    Person person =
        GenericBuilder.of(Person::new)
            .with(Person::setAge, 1)
            .with(Person::setName, "asfasf")
            .build();

    Person person2 =
        GenericBuilder.of(Person::new)
            .with(Person::setAge, 22)
            .with(Person::setName, "Zezinho da capitinga")
            .build();

    System.out.println(person);
    System.out.println(person2);
  }
}
