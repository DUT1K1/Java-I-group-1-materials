import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        //--module-path /Users/davidmaisuradze/Mziuri-materials/Libraries/javafx-sdk-21.0.10/lib --add-modules javafx.controls,javafx.fxml
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.DARKMAGENTA);
        Image image = new Image("img.png");
        stage.getIcons().add(image);
        stage.setTitle("First Application!");
        stage.setScene(scene);
        stage.show();
    }
}
