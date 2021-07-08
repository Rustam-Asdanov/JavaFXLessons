package lessonTwo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle player = new Circle();

    @FXML
    void initialize() {


    }

    @FXML
    public void startFunction(ActionEvent actionEvent) {

        player.requestFocus();
        player.setOnKeyPressed((e)->{
            if(e.getCode() == KeyCode.SPACE){
                System.out.println("w");
                player.setLayoutX(player.getLayoutX()-5);
            }
        });
    }
}
