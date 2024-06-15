package View;

import Control.LoginController;
import Control.RailwayController;
import javax.swing.*;

public class LoginView extends JFrame {
    public JTextField unamrbox;
    public JPasswordField pwordbox;
    public JButton loginbtn;
    public JButton registerbtn;

    public LoginView() {
        initComponents();
    }
    

    private void initComponents() {
        // Initialize components
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        unamrbox = new JTextField();
        pwordbox = new JPasswordField();
        loginbtn = new JButton();
        registerbtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 119, 44));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 88, 82, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 149, 82, 33));

        jPanel1.add(unamrbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 94, 179, -1));
        jPanel1.add(pwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 149, 179, -1));

        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        loginbtn.setText("Login");
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 255, -1, -1));

        registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        registerbtn.setText("Register");
        jPanel1.add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 255, -1, -1));

        JLabel jLabel4 = new JLabel();
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/InterFaces/Image/IRCTC.jpeg"))); 
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 440, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack(); 
    }
    public static void main(String args[]) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginView loginView = new LoginView();
                LoginController loginController = new LoginController(loginView);
                loginView.setVisible(true);
            }
        });
    }

}
