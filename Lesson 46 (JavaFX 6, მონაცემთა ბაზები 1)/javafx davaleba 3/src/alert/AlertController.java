package alert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class AlertController {
    @FXML
    private Button button;
    int counter = 0;

    public void close(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        counter++;

        if (counter == 5) {
            counter = 0;
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit");
            alert.setHeaderText("Want to exit?");
            alert.showAndWait();
            if (alert.getResult() == ButtonType.OK) {
                stage.close();
            }
        }
    }
}
