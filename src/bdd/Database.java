package bdd;
import java.sql.*;


public class Database {

  protected static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
  protected static final String DB_NAME = "simulation";
  protected static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
  protected static final String USER = "SYSTEM";
  protected static final String PASSWORD = "14111995";

  public enum SortOrder { ASC, DESC; }

  static {
      
    try {
      Class.forName(DRIVER_NAME).newInstance();
      System.out.println("*** Driver loaded.");
    }
    catch (ClassNotFoundException e) {
      System.err.println("*** ERROR: Driver " + DRIVER_NAME + " not found");
    }
    catch (InstantiationException e) {
      System.err.println("*** ERROR: Impossible to create an instance of " + DRIVER_NAME);
      System.err.println(e.getMessage());
    }
    catch (IllegalAccessException e) {
      System.err.println("*** ERROR: Impossible to create an instance of " + DRIVER_NAME);
      System.err.println(e.getMessage());
    }
  }

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }

}
