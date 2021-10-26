package br.com.healthtrack.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
  public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

  public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

  public static final String USER = "";

  public static final String PASSWORD = "";

  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName(DRIVER);
      connection = DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return connection;
  }
}
