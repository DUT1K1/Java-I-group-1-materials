package scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {


    public void red(ActionEvent event) throws IOException {
        switchScene(event, "red.fxml");
    }

    public void yellow(ActionEvent event) throws IOException {
        switchScene(event, "yellow.fxml");
    }

    public void green(ActionEvent event) throws IOException {
        switchScene(event, "green.fxml");
    }

    public void goBack(ActionEvent event) throws IOException {
        switchScene(event, "first.fxml");
    }

    private void switchScene(ActionEvent event, String sceneName) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(
                sceneName
        ));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
