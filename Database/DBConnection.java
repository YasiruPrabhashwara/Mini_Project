package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/railwayreservationsystem";
            conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
        return conn;
    }
}
