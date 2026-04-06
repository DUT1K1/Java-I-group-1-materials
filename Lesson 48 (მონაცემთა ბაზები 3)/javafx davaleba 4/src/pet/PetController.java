package pet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PetController {
    @FXML
    private ToggleGroup pet;
    @FXML
    private TextField textfield;
    @FXML
    private Label label;

    public void pick() {
        System.out.println(pet.getSelectedToggle());
        setLabelText(
                ((RadioButton) pet.getSelectedToggle()).getText()
        );
    }

    private void setLabelText(String pet) {
        label.setText("შენ აირჩიე " + pet + " სახელად " + textfield.getText());
    }
}
