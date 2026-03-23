package davaleba3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class ClickController {
    @FXML
    private Button button;
    @FXML
    private AnchorPane background;

    private final Random random = new Random();

    public void jump() {
        double backgroundHeight = background.getHeight();
        double backgroundWidth = background.getWidth();

        double randomX = random.nextDouble() * (backgroundWidth - button.getWidth());
        double randomY = random.nextDouble() * (backgroundHeight - button.getHeight());

        button.setLayoutX(randomX);
        button.setLayoutY(randomY);
    }
}
