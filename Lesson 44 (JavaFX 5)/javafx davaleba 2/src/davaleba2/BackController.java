package davaleba2;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class BackController {
    @FXML
    private AnchorPane background;
    private final Random random = new Random();

    public void changeBackground() {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        background.setStyle(
                String.format(
                        "-fx-background-color: rgb(%d, %d, %d);", red, green, blue
                )
        );
    }
}
