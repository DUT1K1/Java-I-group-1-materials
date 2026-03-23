package color;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class ColorController {
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private AnchorPane back;

    public void changeColor() {
        Color color = colorPicker.getValue();
//        back.setBackground(
//                new Background(
//                        new BackgroundFill(color, null, null)
//                )
//        );
        back.setStyle(
                String.format("-fx-background-color: rgb(%d, %d, %d);",
                        (int) (color.getRed() * 255) ,
                        (int) (color.getGreen() * 255) ,
                        (int) (color.getBlue() * 255))
        );
    }
}
