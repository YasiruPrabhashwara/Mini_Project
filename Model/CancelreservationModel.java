package Model;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CancelreservationModel {

    public CancelreservationModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean cancelReservation(String name, String nic, String trainNo) throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        String query = "DELETE FROM reserve WHERE Name='" + name + "' AND NIC='" + nic + "' AND TrainNo='" + trainNo + "'";
        int rowsDeleted = statement.executeUpdate(query);
        return rowsDeleted > 0;
    }
}
