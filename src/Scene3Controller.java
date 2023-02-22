
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Scene3Controller implements Initializable
{
    DataSingleton data = DataSingleton.getInstances();
    @FXML
    private TableView<User> table1;
    @FXML 
    private TableColumn<User, String> tableSource1;
    @FXML
    private TableColumn<User, String> tableDestination1;
    @FXML
    private TableColumn<User, String> tableName1;
    @FXML
    private TableColumn<User, LocalDate> tableDate1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {

      tableSource1.setCellValueFactory(new PropertyValueFactory<User, String>("source"));
     tableDestination1.setCellValueFactory(new PropertyValueFactory<User, String>("destination"));
     tableName1.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
     tableDate1.setCellValueFactory(new PropertyValueFactory<User, LocalDate>("date"));
    }
    public void showData(String name,String source,String destination,LocalDate date)
    {
            User user = new User(name,source,destination,date);
            ObservableList<User> users = table1.getItems();
            users.add(user);
            table1.setItems(users);
    }
}