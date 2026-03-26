package tree;

import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ContextMenuEvent;

public class TreeController {
    @FXML
    private TreeView<String> tree;

    @FXML
    private void initialize() {
        TreeItem<String> root = new TreeItem<>("files");
        TreeItem<String> music = new TreeItem<>("music");
        TreeItem<String> documents = new TreeItem<>("documents");
        TreeItem<String> games = new TreeItem<>("games");

        root.getChildren().addAll(music, documents, games);
        tree.setRoot(root);

        TreeItem<String> music1 = new TreeItem<>("music1");
        TreeItem<String> music2 = new TreeItem<>("music2");
        music.getChildren().addAll(music1, music2);
    }

    public void select() {
        System.out.println(
                tree
                        .getSelectionModel()
                        .getSelectedItem()
                        .getValue()
        );
    }
}
