package agechecker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AgeController {
    @FXML
    private Text statusLabel;
    @FXML
    private TextField ageTextField;


    public void submit(ActionEvent event) {
        AgeService ageService = new AgeService(statusLabel, ageTextField);
        ageService.submitAge();
    }
}
