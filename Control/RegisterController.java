// RegisterController.java
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

public class RegisterController {
    private RegisterView registerView;
    private UserDAO userDAO;

    public RegisterController(RegisterView registerView) {
        this.registerView = registerView;
        this.userDAO = new UserDAO();
        this.registerView.registerbtn.addActionListener(new RegisterActionListener());
        this.registerView.cancelbtn.addActionListener(new CancelActionListener());
    }

public class RegisterActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = registerView.unamebox.getText();
            String password = new String(registerView.pwordbox.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(registerView, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                User user = new User(username, password);
                if (userDAO.registerUser(user)) {
                    JOptionPane.showMessageDialog(registerView, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    LoginView loginView = new LoginView();
                    LoginController loginController = new LoginController(loginView);
                    loginView.setVisible(true);
                    registerView.dispose();
                } else {
                    JOptionPane.showMessageDialog(registerView, "Failed to register user", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(registerView, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

public class CancelActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LoginView loginView = new LoginView();
            LoginController loginController = new LoginController(loginView);
            loginView.setVisible(true);
            registerView.dispose();
        }
    }
}
