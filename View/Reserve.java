package View;

import Control.ReserveController;
import Model.ReserveModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Reserve extends javax.swing.JFrame {

    private ReserveController controller;

    public Reserve() {
        initComponents();
    }

    public void setController(ReserveController controller) {
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        bbtn = new javax.swing.JButton();
        Rbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        niclabe = new javax.swing.JLabel();
        nicbox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bbtn.setBackground(new java.awt.Color(255, 0, 0));
        bbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        bbtn.setForeground(new java.awt.Color(255, 255, 255));
        bbtn.setText("Back");
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });
        getContentPane().add(bbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 249, 90, -1));

        Rbtn.setBackground(new java.awt.Color(255, 0, 0));
        Rbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        Rbtn.setForeground(new java.awt.Color(255, 255, 255));
        Rbtn.setText("Reserve");
        Rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Rbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 59, 164, 25));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Train no");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 84, 84, 28));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Train Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 118, 136, 25));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 60, 210, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 90, 210, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 210, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reserve");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 9, 234, 38));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 164, -1));

        Date.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 150, 210, -1));

        niclabe.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        niclabe.setForeground(new java.awt.Color(255, 255, 255));
        niclabe.setText("NIC");
        getContentPane().add(niclabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 147, -1));

        nicbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        getContentPane().add(nicbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 180, 210, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterFaces/Image/pngtree-an-express-train-travelling-through-a-wooded-picture-image_2491641.jpg"))); 
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 340));

        pack();
    }
    public static void main(String args[]) {
         
           SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ReserveModel Rmodel = new ReserveModel();
                Reserve view = new Reserve();
                ReserveController controller = new ReserveController(Rmodel, view);
                view.setVisible(true);
            }
        });
    }

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if (controller != null) {
            controller.backButtonPressed();
        } else {
            showMessage("Controller not set.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                    

    private void RbtnActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if (controller != null) {
            String name = jTextField1.getText();
            String trainNo = jTextField2.getText();
            String trainName = jTextField3.getText();
            String reservationDate = Date.getText();
            String NIC = nicbox.getText();

            controller.reserveButtonPressed(name, trainNo, trainName, reservationDate, NIC);
        } else {
            showMessage("Controller not set.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   

    public void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    private javax.swing.JTextField Date;
    private javax.swing.JButton Rbtn;
    private javax.swing.JButton bbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField nicbox;
    private javax.swing.JLabel niclabe;
}
