package Model;

import Database.DBConnection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrainModel {

    public DefaultTableModel searchTrainsByName(String trainName) {
        DefaultTableModel model = new DefaultTableModel();

        try {
            // Obtain the connection from DBConnection
            Connection connection = DBConnection.getConnection();

            // Create a statement from the connection
            Statement statement = connection.createStatement();

            // Define the query
            String query = "SELECT * FROM search WHERE `Train Name` LIKE '%" + trainName + "%'";

            // Execute the query
            ResultSet resultSet = statement.executeQuery(query);

            // Get metadata
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Add columns to the model
            for (int column = 1; column <= columnCount; column++) {
                model.addColumn(metaData.getColumnLabel(column));
            }

            // Add rows to the model
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int column = 0; column < columnCount; column++) {
                    row[column] = resultSet.getObject(column + 1);
                }
                model.addRow(row);
            }

            // Close the result set and statement
            resultSet.close();
            statement.close();

            // If no rows are found, throw an exception
            if (model.getRowCount() == 0) {
                throw new SQLException("No records found for the entered train name");
            }

        } catch (SQLException ex) {
            Logger.getLogger(TrainModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return model;
    }
}
