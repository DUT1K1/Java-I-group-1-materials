import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("menu/menu.fxml"))
                )
        );
        stage.show();
    }
}
