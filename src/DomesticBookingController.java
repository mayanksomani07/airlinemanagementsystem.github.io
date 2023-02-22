import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mayan
 */
public class DomesticBookingController implements Initializable {
    //DataSingleton data = DataSingleton.getInstances();
    @FXML
    private TextField name;
    @FXML
    private ChoiceBox<String> from, to;
    @FXML
    private Button bookButton;
    @FXML
    private DatePicker date;
    @FXML
    private Button add;
    @FXML
    public void book(ActionEvent event) throws IOException
    {   
      if(event.getSource() == bookButton)
      {         if((from.getValue().equalsIgnoreCase("Kolkata")&&to.getValue().equalsIgnoreCase("Bangalore"))
              ||(from.getValue().equalsIgnoreCase("Kolkata")&&to.getValue().equalsIgnoreCase("Delhi"))
              ||(from.getValue().equalsIgnoreCase("Bangalore")&&to.getValue().equalsIgnoreCase("Kolkata"))
              ||(from.getValue().equalsIgnoreCase("Bangalore")&&to.getValue().equalsIgnoreCase("Indore"))
              ||(from.getValue().equalsIgnoreCase("Indore")&&to.getValue().equalsIgnoreCase("Delhi")))
      {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
                Parent root = loader.load();
                Scene5Controller scene5controller = loader.getController();
                scene5controller.showInformation(name.getText(),from.getValue(),to.getValue());
                Stage primaryStage = new Stage();
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
      }
      else
      {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Booking Failed!");
                alert.setContentText("Ticket not availble.");
                alert.setHeaderText("Booking Failed!");
                alert.showAndWait();
      }
    }
}
    @FXML
     public void add(ActionEvent event) throws IOException 
    {
        if(event.getSource()==add)
        {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
    private final String[] place1 = {"Kolkata", "Delhi", "Bangalore", "Mumbia", "Jaipur", "Indore"};
    //private final String[] place2 = {"India", "USA", "London", "NewYork", "Paris", "Dubia"};
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       from.getItems().addAll(place1);
       to.getItems().addAll(place1);
       
      // from1.getItems().addAll(place2);
      // to1.getItems().addAll(place2);
    }    
    
}
