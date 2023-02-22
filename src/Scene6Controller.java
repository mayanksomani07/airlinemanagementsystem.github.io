import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


/**
 *
 * @author mayan
 */
public class Scene6Controller {
    @FXML
    private RadioButton flight;
    @FXML
    private RadioButton user;
    @FXML
    public void option2(ActionEvent event) throws IOException
    {
        if(flight.isSelected())
        {
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Scene9.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        if(user.isSelected())
        {
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
        }
    }
    
}
