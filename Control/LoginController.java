// LoginController.java
package Control;

import Model.User;
import Model.UserDAO;
import View.LoginView;
import View.RegisterView;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import Database.DBConnection; 
import View.RailwayReservationView;

public class LoginController {
    private LoginView loginView;
    private UserDAO userDAO;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.userDAO = new UserDAO();
        this.loginView.loginbtn.addActionListener(new LoginActionListener());
        this.loginView.registerbtn.addActionListener(new RegisterActionListener());
    }

    class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = loginView.unamrbox.getText();
            String password = new String(loginView.pwordbox.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(loginView, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                User user = new User(username, password);
                if (userDAO.validateUser(user)) {
                    JOptionPane.showMessageDialog(loginView, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    RailwayReservationView railwayView = new RailwayReservationView();
                    RailwayController railwayController = new RailwayController(railwayView);
                    railwayView.setVisible(true);
                    loginView.dispose();
                } else {
                    JOptionPane.showMessageDialog(loginView, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(loginView, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }

    class RegisterActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            RegisterView registerView = new RegisterView();
            RegisterController registerController = new RegisterController(registerView);
            registerView.setVisible(true);
            loginView.dispose();
        }
    }
}
