package org.tech;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/employeemanagement";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "surafel";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load JDBC driver. Make sure the driver JAR is in the classpath.", e);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to establish a database connection.", e);
        }
    }
}

