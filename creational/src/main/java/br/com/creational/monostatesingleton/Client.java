package br.com.creational.monostatesingleton;

import br.com.creational.monostatesingleton.connectionPool.Connection;
import br.com.creational.monostatesingleton.connectionPool.ConnectionPool;

public class Client {

  public static void doQuery1() {
    ConnectionPool pool = new ConnectionPool();
    Connection conn = pool.getConnection();

    if (conn != null) {
      conn.query("SELECT * from A1");
    }
  }

  public static void doQuery2() {
    ConnectionPool pool = new ConnectionPool();
    Connection conn = pool.getConnection();

    if (conn != null) {
      conn.query("SELECT * from A1");
    }
  }

  public static void doQuery3() {
    ConnectionPool pool = new ConnectionPool();
    Connection conn = pool.getConnection();

    if (conn != null) {
      conn.query("SELECT * from A1");
    }
  }

  public static void main(String[] args) {
    doQuery1();
    doQuery2();
    doQuery3();
  }
}
