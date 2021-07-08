package lessonOne;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    public Label countryLabel;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField filterField;

    @FXML
    private TableView<Human> table;

    @FXML
    private TableColumn<Human, Integer> idColumn;

    @FXML
    private TableColumn<Human, String> nameColumn;

    @FXML
    private TableColumn<Human, String> countryColumn;

    private FilteredList<Human> filteredList;
    private ObservableList<Human> humanList = FXCollections.observableArrayList(
            new Human(1,"Oktay","USA"),
            new Human(2,"Kenan","france")
    );

    @FXML
    void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<Human,Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Human, String>("name"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<Human, String>("country"));

        table.setItems(humanList);

        filteredList = new FilteredList<>(humanList,p->true);
        filterField.textProperty().addListener((observable, oldValue, newValue)->{
           filteredList.setPredicate(p->p.getName().toLowerCase().startsWith(newValue.toLowerCase(Locale.ROOT).trim()));
           table.setItems(filteredList);
           if(newValue.isEmpty()) table.setItems(humanList);
           countryLabel.setText(""+filteredList.size());
        });
    }
}
