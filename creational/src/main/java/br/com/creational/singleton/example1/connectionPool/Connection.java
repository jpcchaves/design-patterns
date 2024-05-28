package br.com.creational.singleton.example1.connectionPool;

public class Connection {
  private boolean inUse;

  public Connection(boolean inUse) {
    this.inUse = inUse;
  }

  public boolean isInUse() {
    return inUse;
  }

  public void setInUse(boolean inUse) {
    this.inUse = inUse;
  }

  public void query(String query) {
    System.out.println("Running " + query + " in Connection " + this);
  }
}
