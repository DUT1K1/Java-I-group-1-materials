package imageview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ImageController {
    @FXML
    private ImageView imageView;

    private final Image[] images = {
        new Image(getClass().getResourceAsStream("images/happy.png")),
        new Image(getClass().getResourceAsStream("images/sad.png"))
    };

    private int pointer = 0;

    public  void changeImage(ActionEvent event) {
        imageView.setImage(getImage());
    }

    private Image getImage() {
        if (pointer == images.length) {
            pointer %= images.length;
        }
        return images[pointer++];
    }

}
