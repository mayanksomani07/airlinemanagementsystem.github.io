import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Scene8Controller implements Initializable {
    @FXML
    private TextField source;
    @FXML
    private TextField destination;
    @FXML
    private TextField price;
    @FXML
    private DatePicker date;
    @FXML
    private Button add;
    @FXML
    private Button remove;
    @FXML
    private TableView<Flight> table;
    @FXML 
    private TableColumn<Flight, String> tableSource;
    @FXML
    private TableColumn<Flight, String> tableDestination;
    @FXML
    private TableColumn<Flight, Integer> tablePrice;
    @FXML
    private TableColumn<Flight, LocalDate> tableDate;
    @Override
    public void initialize(URL url, ResourceBundle rb){
     tableSource.setCellValueFactory(new PropertyValueFactory<Flight, String>("source"));
     tableDestination.setCellValueFactory(new PropertyValueFactory<Flight, String>("destination"));
     tablePrice.setCellValueFactory(new PropertyValueFactory<Flight, Integer>("price"));
     tableDate.setCellValueFactory(new PropertyValueFactory<Flight, LocalDate>("date"));
    }
    @FXML
    public void addDetails(ActionEvent event) throws IOException
    {
        if(event.getSource() == add){
        Flight flight = new Flight(source.getText(),destination.getText(), Integer.parseInt(price.getText()), date.getValue());
        ObservableList<Flight> flights = table.getItems();
        flights.add(flight);
        table.setItems(flights);
        }
    } 
    @FXML
    public void removeDetails(ActionEvent event) 
    {
        if(event.getSource() == remove)
        {
            int selectedID = table.getSelectionModel().getSelectedIndex();
            table.getItems().remove(selectedID);
        }
    }
    
}