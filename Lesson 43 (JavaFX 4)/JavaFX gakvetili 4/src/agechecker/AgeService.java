package agechecker;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class AgeService {
    private Text statusLabel;
    private TextField ageTextField;

    public AgeService(Text statusLabel, TextField ageTextField) {
        this.statusLabel = statusLabel;
        this.ageTextField = ageTextField;
    }

    public void submitAge() {
        statusLabel.setFill(Color.BLACK);

        int age = validateAge(ageTextField.getText());
        checkAge(age);
    }

    private int validateAge(String text) {
        int age = 0;
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            statusLabel.setFill(Color.RED);
            statusLabel.setText("Enter prper age!");
            throw new IllegalArgumentException("Enter prper age!");
        }
    }

    private void checkAge(int age) {
        if (age < 18) {
            changeStatus(Color.RED, "You are not old enough!");
        } else {
            changeStatus(Color.GREEN, "You are old enough!");
        }
    }

    private void changeStatus(Color textColor, String text) {
        statusLabel.setFill(textColor);
        statusLabel.setText(text);
    }
}
