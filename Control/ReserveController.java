package Control;

import Model.ReservationModel;
import Model.ReserveModel;
import View.RailwayReservationView;
import View.Reserve;
import javax.swing.JOptionPane;

public class ReserveController {

    private ReserveModel model;
    private Reserve view;

    public ReserveController(ReserveModel model, Reserve view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

   


    

    public void reserveButtonPressed(String name, String trainNo, String trainName, String reservationDate, String NIC) {
        if (name.isEmpty() || trainNo.isEmpty() || trainName.isEmpty() || reservationDate.isEmpty() || NIC.isEmpty()) {
            view.showMessage("Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean success = model.saveReservation(name, trainNo, trainName, reservationDate, NIC);
        if (success) {
            view.showMessage("Reservation saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            view.showMessage("Failed to save reservation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void backButtonPressed() {
        view.setVisible(false);
       RailwayReservationView mainView = new RailwayReservationView(); // Instantiate the main view
        mainView.setVisible(true);  }
}
