package View;

import Control.CancelReservationController;
import Model.ReservationModel;
import javax.swing.*;
import javax.swing.text.View;

public class CancelReservationView extends JFrame {

    public JTextField namebox;
    public JTextField NICbox;
    public JTextField Tnobox;
    public JButton bbtn;
    public JButton okbtn;
    
    public CancelReservationView() {
        initComponents();
    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        bbtn = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        namebox = new JTextField();
        NICbox = new JTextField();
        Tnobox = new JTextField();
        okbtn = new JButton();
        JLabel jLabel5 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bbtn.setBackground(new java.awt.Color(204, 0, 0));
        bbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        bbtn.setForeground(new java.awt.Color(255, 255, 255));
        bbtn.setText("Cancel");
        getContentPane().add(bbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 32));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        jLabel1.setText("Cancel  Reservation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 320, 41));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 137, 37));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 116, 34));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Train No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 93, 29));

        namebox.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 267, -1));

        NICbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(NICbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 267, -1));

        Tnobox.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(Tnobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 267, -1));

        okbtn.setBackground(new java.awt.Color(204, 0, 0));
        okbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setText("Ok");
        getContentPane().add(okbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 74, 32));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterFaces/Image/gettyimages-1281701550-612x612.jpg"))); 
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        pack();
    }
     public static void main(String args[]) {
         
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            ReservationModel model = new ReservationModel();
            CancelReservationView view = new CancelReservationView();
            CancelReservationController loginController = new CancelReservationController(model, view);
            view.setVisible(true);
          
            
        }
    });


     }
}
