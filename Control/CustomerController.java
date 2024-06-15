package Control;

import Model.Customer;
import Model.CustomerDAO;
import javax.swing.JOptionPane;
import View.CustomerDetails;
import View.RailwayReservationView;

public class CustomerController {
    private CustomerDetails view;
    private CustomerDAO customerDAO;

    public CustomerController(CustomerDetails view, CustomerDAO customerDAO) {
        this.view = view;
                this.customerDAO = customerDAO;

        // Add action listeners to the buttons
        this.view.addSubmitButtonListener(e -> handleSubmitButton());
        this.view.addBackButtonListener(e -> handleBackButton());
    }

   

    private void handleSubmitButton() {
        String fullName = view.getFullName();
        String nic = view.getNic();
        String destination = view.getDestination();
        String paymentMethod = view.getPaymentMethod();
        String specialRequest = view.getSpecialRequest();

        if (fullName.isEmpty() || nic.isEmpty() || destination.isEmpty() || paymentMethod.isEmpty() || specialRequest.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Customer customer = new Customer(fullName, nic, destination, paymentMethod, specialRequest);
        boolean success = customerDAO.saveCustomer(customer);

        if (success) {
            JOptionPane.showMessageDialog(view, "Customer details saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Failed to save customer details", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleBackButton() {
        view.setVisible(false);
       RailwayReservationView mainView = new RailwayReservationView(); // Instantiate the main view
        mainView.setVisible(true);  
    }
}

