package davaleba1;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallController {
    @FXML
    private Circle circle;
    private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
    private int colorIndex = 0;

    public void up() {
        circle.setCenterY(circle.getCenterY() - 10);
    }

    public void down() {
        circle.setCenterY(circle.getCenterY() + 10);
    }

    public void left() {
        circle.setCenterX(circle.getCenterX() - 10);
    }

    public void right() {
        circle.setCenterX(circle.getCenterX() + 10);
    }

    public void upRight() {
        up();
        right();
    }

    public void upLeft() {
        up();
        left();
    }

    public void downRight() {
        down();
        right();
    }

    public void downLeft() {
        down();
        left();
    }

    public void changeColor() {
        circle.setFill(getColor());
    }

    private Color getColor() {
        if (colorIndex >= colors.length) {
            colorIndex = 0;
        }
        return colors[colorIndex++];
    }

}
