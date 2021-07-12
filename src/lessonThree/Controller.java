package lessonThree;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    public Label sureField;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField resultField;

    @FXML
    void startFunction(ActionEvent event) {
        if(loginField.getText().isEmpty() || passwordField.getText().isEmpty()){
            JOptionPane optionPane = new JOptionPane("Заполните все поля",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Внимание!");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } else {
            JOptionPane.showOptionDialog(null,"Действие завершено удачно", "Уведомление",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,new Object[]{},null);
        }
    }

    @FXML
    void initialize() {

    }

    @FXML
    public void infoFunction(ActionEvent actionEvent) {
        String info = JOptionPane.showInputDialog("Enter name");
        if(info.isEmpty()){
            JOptionPane.showOptionDialog(
                    null, "Нельзя оставить поле пустым","Уведомление",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                    null, new Object[]{}, null);
        }
    }

    @FXML
    public void sureFinction(ActionEvent actionEvent) {
        JOptionPane.showConfirmDialog(null, "Вы уверены?",
                "Уведомление",JOptionPane.YES_NO_OPTION);
    }
}
