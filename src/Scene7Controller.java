/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mayan
 */
public class Scene7Controller implements Initializable {

    @FXML
    private TextField sourcec;
    @FXML
    private TextField destinationc;
    @FXML
    private TextField namec;
    @FXML 
    private TextField wallet;
    @FXML
    private Button cancel;
    @FXML
    private Button add;
    @FXML
    public void cancel(ActionEvent event) throws IOException
    {
        if(event.getSource()==cancel)
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
     public void walletAdd2(String money)
    {
        wallet.setText(money);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
