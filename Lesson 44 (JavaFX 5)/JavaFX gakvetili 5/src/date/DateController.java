package date;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateController {
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label label;

    public void getDate() {
        LocalDate date = datePicker.getValue();
        String dateString = date.format(
                DateTimeFormatter.ofPattern("dd-MMMM-YYY")
        );
        label.setText(dateString);
    }
}
