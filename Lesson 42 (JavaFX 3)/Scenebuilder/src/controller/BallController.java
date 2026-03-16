package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class BallController {
    @FXML
    private Circle myCircle;

    public void up(ActionEvent event) {
        myCircle.setCenterY(
                myCircle.getCenterY() - 10
        );
    }

    public void down(ActionEvent event) {
        myCircle.setCenterY(
                myCircle.getCenterY() + 10
        );
    }

    public void left(ActionEvent event) {
        myCircle.setCenterX(
                myCircle.getCenterX() - 10
        );
    }

    public void right(ActionEvent event) {
        myCircle.setCenterX(
                myCircle.getCenterX() + 10
        );
    }
}
