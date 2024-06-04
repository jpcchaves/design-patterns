package br.com.creational.builder.generic;

import br.com.creational.builder.generic.model.Book;
import br.com.creational.builder.generic.model.Builder;

public class Client {
  public static void main(String[] args) {
    Book book =
        Builder.builder(Book.class)
            .with(b -> b.setAuthor("Eu"))
            .with(b -> b.setName("Livro tal"))
            .with(b -> b.setIsbn("31231"))
            .build();
  }
}
