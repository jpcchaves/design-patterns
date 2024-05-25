package br.com.creational.monostatesingleton.connectionPool;

import java.util.logging.Logger;

public class Connection {
  private static final Logger _logger = Logger.getLogger(Connection.class.getName());

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
    _logger.info("Running " + query + " in Connection " + this);
  }
}
