package logout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LogoutController {
    @FXML
    private AnchorPane background;

    public void logout(ActionEvent event) {
        Alert alert = new Alert(
                Alert.AlertType.CONFIRMATION
        );
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to log out");
        alert.setContentText("Are your sure?");

        if (alert.showAndWait().get().equals(ButtonType.OK)) {
            Stage stage = (Stage) background.getScene().getWindow();
            stage.close();
        }
    }
}
