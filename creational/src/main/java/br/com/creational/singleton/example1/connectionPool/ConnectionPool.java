package br.com.creational.singleton.example1.connectionPool;

import br.com.creational.singleton.example1.Client;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ConnectionPool {
  private static final Logger _logger = Logger.getLogger(Client.class.getName());
  private static final ConnectionPool _instance = new ConnectionPool();
  private final static int POOL_SIZE = 2;
  private final List<Connection> connectionsList = new ArrayList<>();

  private ConnectionPool() {
    _logger.info("Creating connection pool...");

    for (int i = 0; i < POOL_SIZE; i++) {
      connectionsList.add(new Connection(false));
    }

  }

  public static ConnectionPool getInstance() {
    return _instance;
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
      _logger.info("No connections available!");
      return null;
    }

    available.setInUse(true);
    return available;
  }

  public void disconnect(Connection conn) {
    conn.setInUse(false);
  }

}
