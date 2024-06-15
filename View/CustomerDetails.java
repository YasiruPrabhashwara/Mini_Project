package View;

import Control.CustomerController;
import Model.CustomerDAO;
import javax.swing.*;
import java.awt.event.ActionListener;

public class CustomerDetails extends javax.swing.JFrame {

    private javax.swing.JTextField Tobox;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField fnambox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nicbox;
    private javax.swing.JButton sbutton;

    public CustomerDetails() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fnambox = new javax.swing.JTextField();
        nicbox = new javax.swing.JTextField();
        sbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Tobox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 14, 192, 36));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 71, 91, -1));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 111, 76, -1));

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 157, 76, -1));

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment Method");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 203, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Special Request");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 254, 170, -1));

        fnambox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(fnambox, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 68, 364, -1));

        nicbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(nicbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 108, 364, -1));

        sbutton.setBackground(new java.awt.Color(204, 0, 0));
        sbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sbutton.setForeground(new java.awt.Color(255, 255, 255));
        sbutton.setText("Submit");
        jPanel1.add(sbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 315, -1, -1));

        backbutton.setBackground(new java.awt.Color(204, 0, 0));
        backbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setText("Back");
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 315, 90, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 200, 364, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 251, 364, -1));

        Tobox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(Tobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 154, 364, -1));

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterFaces/Image/cb-railway-station-train-manipulation-background-hd-download-11644076107q79sxejszg.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
    }
    public static void main(String args[]) {
         
    SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CustomerDetails view = new CustomerDetails();
                CustomerDAO model = new CustomerDAO();
                CustomerController controller = new CustomerController(view, model);
                view.setVisible(true);
            }
        });
    }

    // Getters for the form fields
    public String getFullName() {
        return fnambox.getText();
    }

    public String getNic() {
        return nicbox.getText();
    }

    public String getDestination() {
        return Tobox.getText();
    }

    public String getPaymentMethod() {
        return jTextField3.getText();
    }

    public String getSpecialRequest() {
        return jTextField4.getText();
    }

    // Methods to add action listeners to the buttons
    public void addSubmitButtonListener(ActionListener listener) {
        sbutton.addActionListener(listener);
    }

    public void addBackButtonListener(ActionListener listener) {
        backbutton.addActionListener(listener);
    }}


