
package View;

import Control.RegisterController;
import javax.swing.*;

public class RegisterView extends JFrame {
    public JTextField unamebox;
    public JPasswordField pwordbox;
    public JButton registerbtn;
    public JButton cancelbtn;

    public RegisterView() {
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        registerbtn = new JButton();
        cancelbtn = new JButton();
        pwordbox = new JPasswordField();
        unamebox = new JTextField();
        JLabel jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 152, 43));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 127, 32));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 127, 31));

        registerbtn.setBackground(new java.awt.Color(204, 0, 0));
        registerbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        registerbtn.setText("Register");
        jPanel1.add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        cancelbtn.setBackground(new java.awt.Color(204, 0, 0));
        cancelbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        pwordbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        jPanel1.add(pwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 240, -1));

        unamebox.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        jPanel1.add(unamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 240, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/InterFaces/Image/ai-generated-toy-like-train-speeds-through-mountainous-landscape-tracks-detailed-in-close-up-ai-generative-photo.jpg"))); 
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 930, 440));

        getContentPane().add(jPanel1);

        pack();
    
    }
     public static void main(String args[]) {
         
   SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RegisterView registerview = new RegisterView();
                RegisterController registercontroller = new RegisterController(registerview);
                registerview.setVisible(true);
            }
        });
    
     }

}
      
               

                
