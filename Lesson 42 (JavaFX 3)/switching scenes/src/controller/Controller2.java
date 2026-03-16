package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 {
    @FXML
    private Label greetLabel;

    public void greet(String username) {
        greetLabel.setText("Hello " + username);
    }

    public void tryAgain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("../scene/login.fxml")
        );
        Scene scene = new Scene(root);
        Stage stage = (Stage) greetLabel.getScene().getWindow();
        stage.setScene(scene);
    }
}
