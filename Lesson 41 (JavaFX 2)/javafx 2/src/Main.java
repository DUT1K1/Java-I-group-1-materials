import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.script.ScriptEngine;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Group group = new Group();
//        Scene scene = new Scene(group, Color.rgb(203, 20, 223));
//        Scene scene = new Scene(group, Color.valueOf("CB14DF"));
//        Image image = new Image("java.png");
//        stage.getIcons().add(image);

        // size of window
//        stage.setWidth(500);
//        stage.setHeight(400);

        // resizable
//        stage.setResizable(false);

        // coordinates
//        stage.setX(400);
//        stage.setY(600);

        // fullscreen
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("დააჭირე x-ს რომ გამოხვიდე");
//        stage.setFullScreenExitKeyCombination(
//                KeyCombination.valueOf("x")
//        );






        // ===========================================
        Group root = new Group();
        Scene scene = new Scene(root, 800, 800, Color.WHITE);

        // text block
        Text text = new Text();
        text.setText("Hello World!");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("DialogInput", 30));
        text.setStrokeWidth(100);
        text.setFill(Color.BLUE);
        root.getChildren().add(text);

        // line
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(10);
        line.setStroke(Color.RED);
        root.getChildren().add(line);

        // rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(400);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setFill(Color.GREEN);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);
        root.getChildren().add(rectangle);

        // triangle
//        Polygon triangle = new Polygon();
//        triangle.getPoints().setAll(
//                200.0, 250.0,
//                200.0, 300.0,
//                300.0, 300.0,
//                600.0, 450.0,
//                320.0, 110.0
//        );
//        root.getChildren().add(triangle);

        // circle
        Circle circle = new Circle();
        circle.setCenterX(500);
        circle.setCenterY(500);
        circle.setRadius(100);
        circle.setFill(Color.BLUEVIOLET);
        circle.setStroke(Color.LIMEGREEN);
        circle.setStrokeWidth(10);
        root.getChildren().add(circle);

        // image
        Image image = new Image("java.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(600);
        imageView.setY(100);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.setTitle("Hello World!");
        stage.show();
    }
}
