package progress;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.util.Duration;

public class ProgressController {
    @FXML
    private ProgressBar progress;
    @FXML
    private Label label;

    private double state = 0.0;
    private Timeline timeline;


    @FXML
    private void initialize() {
        progress.setStyle("-fx-accent: #00ff00");
        progress.setProgress(state);
        label.setText("0%");

        timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.05), event -> load())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public void load() {
        if (state >= 1) {
            timeline.stop();
            return;
        }

        state += 0.001;

        if (state > 1.0) {
            state = 1.0;
        }

        progress.setProgress(state);
        label.setText(String.format("%.1f", state * 100) + "%");

        if (state >= 1.0) {
            timeline.stop();
        }
    }
}
