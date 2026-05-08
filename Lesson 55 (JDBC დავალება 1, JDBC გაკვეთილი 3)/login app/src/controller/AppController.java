package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class AppController {
    @FXML
    private TextField firstNameField, lastNameField, emailField;
    @FXML
    private PasswordField passwordField;

    public void register() {
        UserDao userDao = new UserDaoImpl();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        User user = new User(email, password, firstName, lastName);
        userDao.create(user);
    }
}
