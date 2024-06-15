package Control;

import Model.TrainModel;
import View.RailwayReservationView;
import View.SearchTrainsView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class SearchTrainsController {

    private TrainModel model;
    private SearchTrainsView view;

    public SearchTrainsController(TrainModel model, SearchTrainsView view) {
        this.model = model;
        this.view = view;

        this.view.searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        this.view.backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
    }

   
    private void searchButtonActionPerformed(ActionEvent evt) {
        String trainName = view.trainNameTextField.getText().trim();

        if (trainName.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please enter a train name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = this.model.searchTrainsByName(trainName);

        if (model == null || model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "No records found for the entered train name", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            view.resultsTable.setModel(model);
        }
    }

    private void backButtonActionPerformed(ActionEvent evt) {
        // Implement the action to go back to the previous screen
        view.setVisible(false);
        
       RailwayReservationView mainView = new RailwayReservationView(); // Instantiate the main view
        mainView.setVisible(true); 
    }

    public static void main(String[] args) {
        TrainModel model = new TrainModel();
        SearchTrainsView view = new SearchTrainsView();
        new SearchTrainsController(model, view);
        view.setVisible(true);
    }
}
