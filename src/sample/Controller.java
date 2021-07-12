package sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public AnchorPane anchor;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void openFilteredExample(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/lessonOne/sample.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 712,493));
            stage.setTitle("New Window");
            stage.setResizable(false);
            stage.show();
            ((Stage) anchor.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {

    }

    @FXML
    public void playerRunFunction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/lessonTwo/sample.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 712,493));
            stage.setTitle("New Window");
            stage.setResizable(false);
            stage.show();
            ((Stage) anchor.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void validationFunction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/lessonThree/sample.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 712,493));
            stage.setTitle("New Window");
            stage.setResizable(false);
            stage.show();
            ((Stage) anchor.getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
