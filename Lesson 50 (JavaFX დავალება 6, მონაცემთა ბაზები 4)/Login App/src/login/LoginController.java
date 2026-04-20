package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    private final UserStorage storage = new UserStorage();
    @FXML
    private Label signupStatus, loginLabel;
    @FXML
    private TextField signupUsername, loginUsername;
    @FXML
    private PasswordField signupPassword, signupRePassword, loginPassword;

    public void signUp(ActionEvent event) {
        String username = signupUsername.getText();
        String password = signupPassword.getText();
        String rePassword = signupRePassword.getText();
        if (username.isBlank()) {
            signupStatus.setText("Please enter username");
            return;
        }
        if (password.isBlank()) {
            signupStatus.setText("Please enter password");
            return;
        }
        if (rePassword.isBlank()) {
            signupStatus.setText("Please re-enter password");
        }

        if (!password.equals(rePassword)) {
            signupStatus.setText("Passwords should match");
            return;
        }

        User user = new User(username, password);

        storage.addUser(user);
        storage.printUsers();
    }

    public void logIn(ActionEvent actionEvent) {
        String username = loginUsername.getText();
        String password = loginPassword.getText();
        if (username.isBlank()) {
            loginLabel.setText("Please enter username");
            return;
        }
        if (password.isBlank()) {
            loginLabel.setText("Please enter password");
            return;
        }

        User user = storage.getUser(username);
        if (user == null) {
            loginLabel.setText("Username or password is incorrect");
            return;
        }

        if (user.getPassword().equals(password)) {
            loginLabel.setText("Logged in successfully");
            return;
        }
        loginLabel.setText("Username or password is incorrect");
    }
}
