import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author mayan
 */
public class Scene2Controller {
    @FXML
    private RadioButton radioDomestic;
    @FXML
    private RadioButton radioInternational;
    @FXML
    private Button add;
    @FXML 
    private TextField wallet;
    @FXML
    private TextField airmiles;
    @FXML
    public void bookType(ActionEvent event) throws IOException
    {
        if(radioDomestic.isSelected())
        {
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("domesticBooking.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        if(radioInternational.isSelected())
        {
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("internationalBooking.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
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
    public void walletAdd1(String money)
    {
        wallet.setText(money);
    }
}
