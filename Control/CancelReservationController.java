package Control;

import Database.DBConnection;
import Model.ReservationModel;
import View.CancelReservationView;
import View.RailwayReservationView; 
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CancelReservationController {
    private final ReservationModel model;
    private final CancelReservationView view;

    public CancelReservationController(ReservationModel model, CancelReservationView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        view.okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelReservation();
            }
        });
        view.bbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBack();
            }
        });
    }

    private void cancelReservation() {
        String name = view.namebox.getText();
        String nic = view.NICbox.getText();
        String trainNo = view.Tnobox.getText();

        if (name.isEmpty() || nic.isEmpty() || trainNo.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DBConnection.getConnection();
            if (connection != null) {
                statement = connection.createStatement();
                String query = "DELETE FROM reserve WHERE Name='" + name + "' AND NIC='" + nic + "' AND TrainNo='" + trainNo + "'";
                int rowsDeleted = statement.executeUpdate(query);

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(view, "Reservation cancelled successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(view, "No matching reservation found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(view, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CancelReservationController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CancelReservationController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CancelReservationController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void goBack() {
       
        RailwayReservationView mainView = new RailwayReservationView(); 
        mainView.setVisible(true); 
        view.dispose();
    }
}
