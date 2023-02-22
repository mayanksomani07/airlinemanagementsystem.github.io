import java.io.IOException;
import java.net.URL;
import java.util.Date;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mayan
 */
public class InternationalBookingController implements Initializable {
    @FXML
    private TextField name1;
    @FXML
    private DatePicker date1;
    @FXML
    private ChoiceBox<String> from1, to1;
    @FXML
    private Button bookButton;
    @FXML
    private Button add;
    @FXML
    public void book(ActionEvent event) throws IOException
    {   
        if(event.getSource() == bookButton){
             if((from1.getValue().equalsIgnoreCase("India")&&to1.getValue().equalsIgnoreCase("Dubia"))
              ||(from1.getValue().equalsIgnoreCase("India")&&to1.getValue().equalsIgnoreCase("NewYork"))
              ||(from1.getValue().equalsIgnoreCase("NewYork")&&to1.getValue().equalsIgnoreCase("London"))
              ||(from1.getValue().equalsIgnoreCase("NewYork")&&to1.getValue().equalsIgnoreCase("Moscow"))
              ||(from1.getValue().equalsIgnoreCase("Paris")&&to1.getValue().equalsIgnoreCase("India")))
             {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
                Parent root = loader.load();
                Scene5Controller scene5controller = loader.getController();
                scene5controller.showInformation(name1.getText(),from1.getValue(),to1.getValue());
                Stage primaryStage = new Stage();
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
             }
             else
             {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Booking Failed!");
                alert.setContentText("Ticket not available.");
                alert.setHeaderText("Booking Failed!");
                alert.showAndWait();
             }
        }
    }
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
    private final String[] place2 = {"India", "NewYork", "London", "Moscow", "Paris", "Dubai"};
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        from1.getItems().addAll(place2);
        to1.getItems().addAll(place2);
    }    
    
}
