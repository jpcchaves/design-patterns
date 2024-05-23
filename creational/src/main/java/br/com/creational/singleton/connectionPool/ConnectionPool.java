package br.com.creational.singleton.connectionPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
  private ConnectionPool() {
    System.out.println("Creating connection pool...");

    for (int i = 0; i < POOL_SIZE; i++) {
      connectionsList.add(new Connection(false));
    }

  }

  public Connection getConnection() {
    Connection available = null;

    for (Connection conn : connectionsList) {
      if (!conn.isInUse()) {
        available = conn;
        break;
      }
    }

    if(available == null) {
      System.out.println("No connections available!");
      return null;
    }

    available.setInUse(true);
    return available;
  }

  public void disconnect(Connection conn) {
    conn.setInUse(false);
  }

  public static ConnectionPool getInstance() {
    return _instance;
  }

  private static final ConnectionPool _instance = new ConnectionPool();
  private final static int POOL_SIZE = 2;
  private final List<Connection> connectionsList = new ArrayList<>();

}
