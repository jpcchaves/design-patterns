package br.com.creational.builder.generic.model;

public class Book {
  private String isbn;
  private String name;
  private String author;

  public Book() {}

  public Book(String isbn, String name, String author) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
