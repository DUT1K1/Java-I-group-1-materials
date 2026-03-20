import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(
//                getClass().getResource("logout/logout.fxml")
//        );
//        Parent root = FXMLLoader.load(
//                getClass().getResource("imageview/image.fxml")
//        );

        Parent root = FXMLLoader.load(
                getClass().getResource("agechecker/age.fxml")
        );
        Scene scene = new Scene(root);


        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        }
        );
        stage.setScene(scene);
        stage.show();
    }

    public void logout(Stage stage) {
        Alert alert = new Alert(
                Alert.AlertType.CONFIRMATION
        );
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to log out");
        alert.setContentText("Are your sure?");

        if (alert.showAndWait().get().equals(ButtonType.OK)) {
            stage.close();
        }
    }
}
