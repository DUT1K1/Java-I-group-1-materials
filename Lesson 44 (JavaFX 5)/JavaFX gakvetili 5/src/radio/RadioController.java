package radio;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioController {
    @FXML
    private Label statusLabel;
    @FXML
    private RadioButton a, b, c;

    public void pick() {
        if (a.isArmed()) {
            statusLabel.setText("Incorrect");
        } else if (b.isArmed()) {
            statusLabel.setText("Incorrect");
        } else if (c.isArmed()) {
            statusLabel.setText("Correct");
        }
    }
}
