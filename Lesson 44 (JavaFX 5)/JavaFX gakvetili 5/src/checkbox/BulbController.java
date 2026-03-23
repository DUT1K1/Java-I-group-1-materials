package checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BulbController {
    @FXML
    private ImageView imageView;
    @FXML
    private Label statusLabel;
    @FXML
    private CheckBox checkBox;

    private final Image on = new Image(getClass().getResourceAsStream("images/on.png"));
    private final Image off = new Image(getClass().getResourceAsStream("images/off.png"));

    public void toggle() {
        if (checkBox.isSelected()) {
            imageView.setImage(on);
            statusLabel.setText("ON");
        } else {
            imageView.setImage(off);
            statusLabel.setText("OFF");
        }
    }
}
