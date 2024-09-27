package br.com.creational.monostatesingleton.connectionPool;

import br.com.creational.monostatesingleton.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ConnectionPool {
  private static final Logger _logger = Logger.getLogger(Client.class.getName());
  private static final int POOL_SIZE = 2;
  private static final List<Connection> connectionsList;

  static {
    connectionsList = new ArrayList<>();

    for (int i = 0; i < POOL_SIZE; i++) {

      connectionsList.add(new Connection(false));
    }
  }

  public ConnectionPool() {
    _logger.info("You created a new instance of a Connection Pool");
  }

  public Connection getConnection() {
    Connection available = null;

    for (Connection conn : connectionsList) {
      if (!conn.isInUse()) {
        available = conn;
        break;
      }
    }

    if (available == null) {
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
