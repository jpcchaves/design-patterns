package br.com.creational.builder.mineexample;

public class ExampleBuilder1 {
  private Long id;
  private String name;
  private String description;

  public ExampleBuilder1() {}

  public ExampleBuilder1(Long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public ExampleBuilder1(builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "ExampleBuilder1{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", description='"
        + description
        + '\''
        + '}';
  }

  public static class builder {
    private Long id;
    private String name;
    private String description;

    public builder setId(Long id) {
      this.id = id;
      return this;
    }

    public builder setName(String name) {
      this.name = name;
      return this;
    }

    public builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public ExampleBuilder1 build() {
      return new ExampleBuilder1(this);
    }
  }
}
