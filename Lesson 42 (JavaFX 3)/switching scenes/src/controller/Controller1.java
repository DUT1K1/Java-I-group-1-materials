package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller1 {
    @FXML
    private TextField usernameField;

    public void login(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        System.out.println("username: " + username);

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("../scene/greet.fxml")
        );
        Parent root = loader.load();

        Controller2 controller2 = loader.getController();
        controller2.greet(username);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
}
