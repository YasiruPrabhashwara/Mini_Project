import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                // Register JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Open a connection
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwayreservationsystem", "root", PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Handle any exceptions
            e.printStackTrace();
            throw new SQLException("Failed to connect to the database.");
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
