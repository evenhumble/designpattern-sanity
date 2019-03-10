package io.hedwig.dp.demos.structural.facade.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: patrick on 2019-03-02
 * @Description:
 */
public class JDBCFacade {

  private Connection conn = null;
  private Statement statement = null;

  public void open(String driver,
                   String jdbcUrl,
                   String userName,
                   String userPwd) {
    try {
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(jdbcUrl, userName, userPwd);
      statement = conn.createStatement();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int executeUpdate(String sql) {
    try {
      return statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
      return -1;
    }
  }

  public ResultSet executeQuery(String sql) {
    try {
      return statement.executeQuery(sql);
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  public void close() {
    try {
      conn.close();
      statement.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
