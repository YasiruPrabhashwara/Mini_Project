package Control;

import Model.ReservationModel;
import Model.ReserveModel;
import Model.TrainModel;
import View.CustomerDetails;
import View.LoginView;
import View.RailwayReservationView;
import View.Reserve;
import View.SearchTrainsView;
import View.CancelReservationView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RailwayController {
    private RailwayReservationView view;

    public RailwayController(RailwayReservationView view) {
        this.view = view;
        initComponents();
        initListeners();
    }

    private void initComponents() {
        // Initialize any components if needed
    }

    private void initListeners() {
        view.getReservebtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleReserve();
            }
        });
        view.getStrainbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSearchTrains();
            }
        });
        view.getCdetailsbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCustomerDetails();
            }
        });
        view.getCreservationbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCancelReservation();
            }
        });
        view.getLoginBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
        view.getLogoutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogout();
            }
        });
    }

   public void handleReserve() {
        Reserve reserveView = new Reserve();
        new ReserveController(new ReserveModel(), reserveView);
        reserveView.setVisible(true);
        view.dispose();
    }

   public void handleSearchTrains() {
        SearchTrainsView searchTrainsView = new SearchTrainsView();
        new SearchTrainsController(new TrainModel(), searchTrainsView);
        searchTrainsView.setVisible(true);
        view.dispose();
    }

    public void handleCustomerDetails() {
        CustomerDetails customerDetailsView = new CustomerDetails();
        customerDetailsView.setVisible(true);
        view.dispose();
    }

    public void handleCancelReservation() {
        CancelReservationView cancelReservationView = new CancelReservationView();
        new CancelReservationController(new ReservationModel(), cancelReservationView);
        cancelReservationView.setVisible(true);
        view.dispose();
    }

    public void handleLogin() {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        view.dispose();
    }

    public void handleLogout() {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        view.dispose();
    }
}
