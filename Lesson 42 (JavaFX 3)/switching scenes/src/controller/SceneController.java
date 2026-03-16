package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    @FXML
    private AnchorPane background;

    public void switchToSceneTwo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("../scene/sceneTwo.fxml")
        );
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    public void switchToSceneOne(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("../scene/sceneOne.fxml")
        );
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    public void changeColor(ActionEvent event) throws IOException {
        background.setStyle("-fx-background-color: #5505a8;");
    }
}
