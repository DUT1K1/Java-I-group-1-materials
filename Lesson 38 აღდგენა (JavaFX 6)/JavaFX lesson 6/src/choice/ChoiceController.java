package choice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private ChoiceBox<String> choice;

    private final String[] pets = {"cat", "dog", "bird", "rabbit"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choice.getItems().addAll(pets);
        choice.setOnAction(this::getPet);
    }

    public void getPet(ActionEvent event) {
        label.setText(choice.getValue());
    }
}
