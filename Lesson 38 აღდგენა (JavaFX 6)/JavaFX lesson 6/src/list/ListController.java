package list;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    @FXML
    public ListView<String> listView;
    @FXML
    public Label label;

    private final String[] pets = {"cat", "dog", "bird", "rabbit", "dog", "bird", "rabbit", "dog", "bird", "rabbit"};
    private String currentPet;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.getItems().addAll(pets);
        listView
                .getSelectionModel()
                .selectedItemProperty()
                .addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        currentPet = listView.getSelectionModel().getSelectedItem();
                        label.setText(currentPet);
                    }
                });
    }
}
