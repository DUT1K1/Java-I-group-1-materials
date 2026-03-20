import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }


    // 1
//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root, Color.CYAN);
//
//        Text text = new Text("გამარჯობა ეს არის აპლიკაცია!");
//        text.setFont(Font.font(40));
//        text.setFill(Color.rgb(255, 0, 0));
//        text.setX(50);
//        text.setY(50);
//        root.getChildren().add(text);
//
//        Image icon = new Image("images/img.png");
//        stage.getIcons().add(icon);
//
//        stage.setScene(scene);
//        stage.setTitle("ჩემი აპლიკაცია");
//        stage.setHeight(500);
//        stage.setWidth(1000);
//        stage.setResizable(false);
//        stage.show();
//    }


    // 2
//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root);
//
//        Rectangle square = new Rectangle();
//        square.setX(0);
//        square.setY(0);
//        square.setWidth(100);
//        square.setHeight(100);
//        square.setFill(Color.rgb(0, 255, 0));
//        root.getChildren().add(square);
//
//        Line d1 = new Line();
//        d1.setStartX(0);
//        d1.setStartY(0);
//        d1.setEndX(100);
//        d1.setEndY(100);
//        d1.setStroke(Color.YELLOW);
//        d1.setStrokeWidth(3);
//        root.getChildren().add(d1);
//
//        Line d2 = new Line();
//        d2.setStartX(0);
//        d2.setStartY(100);
//        d2.setEndX(100);
//        d2.setEndY(0);
//        d2.setStroke(Color.YELLOW);
//        d2.setStrokeWidth(3);
//        root.getChildren().add(d2);
//
//
//        Line side1 = new Line();
//        side1.setStartX(200);
//        side1.setStartY(200);
//        side1.setEndX(400);
//        side1.setEndY(200);
//        side1.setStrokeWidth(2);
//        root.getChildren().add(side1);
//
//        Line side2 = new Line();
//        side2.setStartX(200);
//        side2.setStartY(200);
//        side2.setEndX(200);
//        side2.setEndY(500);
//        side2.setStrokeWidth(2);
//        root.getChildren().add(side2);
//
//        Line side3 = new Line();
//        side3.setStartX(400);
//        side3.setStartY(200);
//        side3.setEndX(400);
//        side3.setEndY(500);
//        side3.setStrokeWidth(2);
//        root.getChildren().add(side3);
//
//        Line side4 = new Line();
//        side4.setStartX(200);
//        side4.setStartY(500);
//        side4.setEndX(400);
//        side4.setEndY(500);
//        side4.setStrokeWidth(2);
//        root.getChildren().add(side4);
//
//        stage.setScene(scene);
//        stage.setHeight(800);
//        stage.setWidth(800);
//        stage.show();
//    }

    // 3

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);

        Circle circle = new Circle();
        circle.setCenterX(500);
        circle.setCenterY(350);
        circle.setRadius(100);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        root.getChildren().add(circle);

        Line mouth = new Line();
        mouth.setStartX(470);
        mouth.setStartY(400);
        mouth.setEndX(530);
        mouth.setEndY(400);
        mouth.setStrokeWidth(10);
        root.getChildren().add(mouth);

        Circle leftEye = new Circle();
        leftEye.setCenterX(455);
        leftEye.setCenterY(325);
        leftEye.setRadius(15);
        root.getChildren().add(leftEye);

        Circle rightEye = new Circle();
        rightEye.setCenterX(545);
        rightEye.setCenterY(325);
        rightEye.setRadius(15);
        root.getChildren().add(rightEye);

        stage.setScene(scene);
        stage.setHeight(700);
        stage.setWidth(1000);
        stage.show();
    }
}
