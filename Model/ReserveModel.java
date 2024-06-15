package Model;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReserveModel {

    public boolean saveReservation(String name, String trainNo, String trainName, String reservationDate, String NIC) {
        try {
            name = name.trim();
            trainNo = trainNo.trim();
            trainName = trainName.trim();
            reservationDate = reservationDate.trim();
            NIC = NIC.trim();
            
            Connection connection = DBConnection.getConnection();
            String query = "INSERT INTO reserve (Name, TrainNo, TrainName, date, NIC) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, trainNo);
            statement.setString(3, trainName);
            statement.setString(4, reservationDate);
            statement.setString(5, NIC);

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
