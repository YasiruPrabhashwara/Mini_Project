package View;

import Control.RailwayController;
import javax.swing.*;
import java.awt.*;

public class RailwayReservationView extends JFrame {
    private JButton cdetailsbtn;
    private JButton strainbtn;
    private JButton reservebtn;
    private JButton creservationbtn;
    private JButton loginBtn;
    private JButton logoutBtn;
    private JLabel Ilabel;

    public RailwayReservationView() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        // Initialize Swing components
        cdetailsbtn = new javax.swing.JButton();
        strainbtn = new javax.swing.JButton();
        reservebtn = new javax.swing.JButton();
        creservationbtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        Ilabel = new javax.swing.JLabel();

        cdetailsbtn.setBackground(new java.awt.Color(255, 204, 204));
        cdetailsbtn.setFont(new java.awt.Font("Times New Roman", 1, 14));
        cdetailsbtn.setText("Customer Details");

        strainbtn.setBackground(new java.awt.Color(255, 204, 204));
        strainbtn.setFont(new java.awt.Font("Times New Roman", 1, 14));
        strainbtn.setText("Search Trains");

        reservebtn.setBackground(new java.awt.Color(255, 204, 204));
        reservebtn.setFont(new java.awt.Font("Times New Roman", 1, 14));
        reservebtn.setText("Reserve");

        creservationbtn.setBackground(new java.awt.Color(255, 204, 204));
        creservationbtn.setFont(new java.awt.Font("Times New Roman", 1, 14));
        creservationbtn.setText("Cancel Reservation");

        loginBtn.setText("Login");
        logoutBtn.setText("Logout");

        Ilabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterFaces/Image/metro-vehicle-chicago-street-wallpaper-preview (1).jpg")));

        // Create a panel for buttons
        
         Dimension buttonSize = new Dimension(100, 40);
        JPanel buttonPanel = new JPanel(new GridLayout(6, 1)); // 6 rows, 1 column
        buttonPanel.setBackground(new Color(0, 0, 0, 0)); // Transparent background
        buttonPanel.setOpaque(false); // Make it transparent
        buttonPanel.add(cdetailsbtn);
        buttonPanel.add(strainbtn);
        buttonPanel.add(reservebtn);
        buttonPanel.add(creservationbtn);
        buttonPanel.add(loginBtn);
        buttonPanel.add(logoutBtn);

        // Set layout for the frame
        getContentPane().setLayout(new BorderLayout());

        // Add components to the content pane
        getContentPane().add(buttonPanel, BorderLayout.WEST);
        getContentPane().add(Ilabel, BorderLayout.CENTER);

        pack();
    }

    // Add getter methods to access Swing components from the Controller
    public JButton getCdetailsbtn() {
        return cdetailsbtn;
    }

    public JButton getStrainbtn() {
        return strainbtn;
    }

    public JButton getReservebtn() {
        return reservebtn;
    }

    public JButton getCreservationbtn() {
        return creservationbtn;
    }

    public JLabel getIlabel() {
        return Ilabel;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public JButton getLogoutBtn() {
        return logoutBtn;
    }

    public static void main(String args[]) {
         
   SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RailwayReservationView reservationview = new RailwayReservationView();
                RailwayController railwaycontroller = new RailwayController(reservationview);
                reservationview.setVisible(true);
            }
        });
}
}
