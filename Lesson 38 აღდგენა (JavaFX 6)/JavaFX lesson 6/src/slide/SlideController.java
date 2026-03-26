package slide;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class SlideController implements Initializable {
    @FXML
    private Slider slider;
    @FXML
    private Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                        System.out.println("Old value: " + oldValue);
                        System.out.println("New value: " + newValue);
                        System.out.println("Observable: " + observable.getValue());
                        label.setText(newValue.intValue() + " Years Old");
                    }
                }
        );
    }
}
