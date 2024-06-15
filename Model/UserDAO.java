package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DBConnection;

public class UserDAO {
    public boolean validateUser(User user) throws SQLException {
        Connection conn = (Connection) DBConnection.getConnection();
        String query = "SELECT * FROM register WHERE Name = ? AND Password = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getPassword());
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }

    public boolean registerUser(User user) throws SQLException {
        Connection conn = (Connection) DBConnection.getConnection();
        String query = "INSERT INTO register (Name, Password) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getPassword());
        int rowsInserted = stmt.executeUpdate();
        return rowsInserted > 0;
    }
}
