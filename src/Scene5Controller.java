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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author mayan
 */
public class Scene5Controller {
    @FXML
    private RadioButton book;
    @FXML
    private RadioButton cancel;
    @FXML
    private Label airmiles;
    @FXML
    private Button add;
    @FXML
    private Label wallet;
    
    //public static Label static_label;
     @FXML
    private RadioButton radioDomestic;
    @FXML
    private RadioButton radioInternational;
      @FXML
    private TextField sourcec;
    @FXML
    private TextField destinationc;
    @FXML
    private TextField namec;
    @FXML
    private Button Cancel;
     @FXML
    private TextField name;
    @FXML
    private ChoiceBox<String> from, to;
    @FXML
    private Button bookButton;
    @FXML
    private DatePicker date;
    @FXML
    private TextField namep;
    @FXML
    private TextField sourcep;
    @FXML
    private TextField destinationp;
    @FXML
    private TextField datep;
    @FXML
    private TextField pricep;
    @FXML
    private Button addAmount;
    @FXML
    private TextField amount;
    @FXML
    private Button payment;
    @FXML
    public void option(ActionEvent event) throws IOException
    {
        if(book.isSelected())
        {
            
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        if(cancel.isSelected())
        {
               Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Scene7.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
        }
    }
  
    
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
    @FXML
    public void cancel(ActionEvent event) throws IOException
    {
        if(event.getSource()==Cancel)
        {
            if((sourcec.getText().equalsIgnoreCase("Bangalore")&&destinationc.getText().equalsIgnoreCase("Kolkata")&&namec.getText().equalsIgnoreCase("Mayank Somani"))
               ||(sourcec.getText().equalsIgnoreCase("Bangalore")&&destinationc.getText().equalsIgnoreCase("Indore")&&namec.getText().equalsIgnoreCase("Prakhar Jaju"))    
               ||(sourcec.getText().equalsIgnoreCase("Kolkata")&&destinationc.getText().equalsIgnoreCase("Bangalore")&&namec.getText().equalsIgnoreCase("Jeet Agarwal"))
               ||(sourcec.getText().equalsIgnoreCase("India")&&destinationc.getText().equalsIgnoreCase("NewYork")&&namec.getText().equalsIgnoreCase("Parthuv Panicker"))
               ||(sourcec.getText().equalsIgnoreCase("Paris")&&destinationc.getText().equalsIgnoreCase("India")&&namec.getText().equalsIgnoreCase("Shashank SS"))
               ||(sourcec.getText().equalsIgnoreCase("India")&&destinationc.getText().equalsIgnoreCase("Dubia")&&namec.getText().equalsIgnoreCase("Amish Raj")))
                    {
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Cancellation Successful!");
                alert.setContentText("Ticket with given information is sucessfully cancelled.");
                alert.setHeaderText("Cancellation Successful!");
                alert.showAndWait();
                    }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Cancellation Failed!");
                alert.setContentText("Ticket with given information is not booked.");
                alert.setHeaderText("Cancellation Failed!");
                alert.showAndWait();
                    }
        }
    }
    
   
    
    @FXML
    public void showInformation(String name, String source, String destination)
    {
        namep.setText(name);
        sourcep.setText(source);
        destinationp.setText(destination);
        if(source.equalsIgnoreCase("Kolkata") && destination.equalsIgnoreCase("Bangalore")){
            pricep.setText("4000");
            airmiles.setText("100");
        }
        if(source.equalsIgnoreCase("Kolkata") && destination.equalsIgnoreCase("Delhi")){
            pricep.setText("4500");
            airmiles.setText("100");
        }
        if(source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Kolkata")){
            pricep.setText("4500");
            airmiles.setText("100");
        }
        if(source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Indore")){
            pricep.setText("3500");
            airmiles.setText("100");
        }
        if(source.equalsIgnoreCase("Indore") && destination.equalsIgnoreCase("Delhi")){
            pricep.setText("3500");
            airmiles.setText("100");
        }
        if(source.equalsIgnoreCase("India") && destination.equalsIgnoreCase("Dubia")){
            pricep.setText("15000");
            airmiles.setText("500");
        }
        if(source.equalsIgnoreCase("India") && destination.equalsIgnoreCase("NewYork")){
            pricep.setText("20000");
            airmiles.setText("500");
        }
        if(source.equalsIgnoreCase("Paris") && destination.equalsIgnoreCase("India")){
            pricep.setText("18000");
            airmiles.setText("500");
        }
        if(source.equalsIgnoreCase("NewYork") && destination.equalsIgnoreCase("London")){
            pricep.setText("14000");
            airmiles.setText("500");
        }
        if(source.equalsIgnoreCase("NewYork") && destination.equalsIgnoreCase("Moscow"))
        {
            pricep.setText("15000");
            airmiles.setText("500");
        }
    }
     @FXML
    private void addAmount(ActionEvent event) throws IOException {
        // addMoney a = new addMoney(Integer.parseInt(amount.getText()));
         //a.setAmount(Integer.parseInt(amount.getText())+Integer.parseInt(wallet.getText()));
         
        if(event.getSource()==addAmount)
        {
                wallet.setText(amount.getText());
                String a = amount.getText();
                String source = null,destination = null,name = null,air = null;
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
                Parent root = loader.load();
                
                if(a.equals("4500"))
                {
                    name="Mayank Somani";
                    source="Bangalore";
                    destination="Kolkata";
                    air="100";
                }
                if(a.equals("3500"))
                {
                    name = "Prakhar Jaju";
                    source = "Bangalore";
                    destination = "Indore";
                     air="100";
                }
                if(a.equals("4000"))
                {
                    name = "Jeet Agarwal";
                    source = "Kolkata";
                    destination = "Bangalore";
                     air="100";
                }
                if(a.equals("20000"))
                {
                    name = "Parthiv Panicker";
                    source = "India";
                    destination = "Neywork";
                     air="500";
                }
                if(a.equals("18000"))
                {
                    name = "Shashank SS";
                    source = "Paris";
                    destination = "India";
                     air="500";
                }
                if(a.equals("15000"))
                {
                    name = "Amish Raj";
                    source = "India";
                    destination = "Dubia";
                     air="500";
                }
                
                Scene5Controller scene5controller = loader.getController();
                scene5controller.walletAdd(a,air,name,source,destination,a);
                Stage primaryStage = new Stage();
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            
        }
    }
    public void payment(ActionEvent event) throws IOException 
    {
        if(event.getSource()==payment)
        {
            int c1 = Integer.parseInt(wallet.getText());
            int c2 = Integer.parseInt(pricep.getText());
            if(c1>=c2)
            {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Scene11.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            }
            else
            {
             Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Insufficient Balance!");
                alert.setContentText("Add more money to wallet to book ticket.");
                alert.setHeaderText("Insufficient Balance!");
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
    public void walletAdd(String money,String air,String name,String source,String destination,String price) throws IOException
    {
        wallet.setText(money); 
        airmiles.setText(air);
         namep.setText(name);
        sourcep.setText(source);
        destinationp.setText(destination);
        pricep.setText(price);
    }
    
    
     public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
