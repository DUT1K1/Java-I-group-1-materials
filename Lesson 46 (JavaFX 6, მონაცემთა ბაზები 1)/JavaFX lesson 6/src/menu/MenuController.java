package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    public void newWindow() throws IOException {
        Scene scene = new Scene(
                FXMLLoader.load(
                        getClass().getResource("menu.fxml")
                )
        );
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
