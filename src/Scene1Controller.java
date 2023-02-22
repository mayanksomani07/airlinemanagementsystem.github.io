import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {
    @FXML
    private TextField textUsername;
    @FXML
    private TextField textPassword;
    @FXML
    private Button button;
    @FXML
    public void login(ActionEvent event) throws IOException
    {
        if(event.getSource() == button)
        {
            String username = textUsername.getText();
            String password = textPassword.getText();
            if(username.equalsIgnoreCase("user") && password.equalsIgnoreCase("user"))
            {
                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
            else if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
            {
                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Scene9.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login Failed!");
                alert.setContentText("Wrong Username or Password entered.");
                alert.setHeaderText("Login Failed!");
                alert.showAndWait();
            }
        }
    }
    
    
    public void initialize(URL url, ResourceBundle rb){
        
    }
}