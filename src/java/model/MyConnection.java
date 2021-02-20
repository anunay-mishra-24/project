package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection getMyConnection() {
        Connection c = null;
        String driver = "com.mysql.jdbc.Driver";
        String dbName = "login_reg";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String dbUser = "root";
        String dbPass = "kiku420";
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, dbUser, dbPass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
}
