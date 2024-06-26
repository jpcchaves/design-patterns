package br.com.creational.singleton.example1;

import br.com.creational.singleton.example1.connectionPool.Connection;
import br.com.creational.singleton.example1.connectionPool.ConnectionPool;

public class Client {

  public static void doQuery1() {
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection conn = pool.getConnection();

    if (conn != null) {
      conn.query("SELECT * from A1");
    }
  }

  public static void doQuery2() {
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection conn = pool.getConnection();

    if (conn != null) {
      conn.query("SELECT * from A1");
    }
  }

  public static void doQuery3() {
    ConnectionPool pool = ConnectionPool.getInstance();
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
