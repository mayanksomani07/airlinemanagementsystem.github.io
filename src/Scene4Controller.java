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
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mayan
 */
public class Scene4Controller implements Initializable {

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
    private Button add;
    @FXML 
    private Button payment;
    @FXML
    private Label wallet;
    
    public void showInformation(String name, String source, String destination,String date)
    {
        namep.setText(name);
        sourcep.setText(source);
        destinationp.setText(destination);
        datep.setText(date);
        if(source.equalsIgnoreCase("Kolkata") && destination.equalsIgnoreCase("Bangalore"))
            pricep.setText("4000");
        if(source.equalsIgnoreCase("Kolkata") && destination.equalsIgnoreCase("Delhi"))
            pricep.setText("4500");
        if(source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Kolkata"))
            pricep.setText("4500");
        if(source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Indore"))
            pricep.setText("3500");
        if(source.equalsIgnoreCase("Indore") && destination.equalsIgnoreCase("Delhi"))
            pricep.setText("3500");
        if(source.equalsIgnoreCase("India") && destination.equalsIgnoreCase("Dubia"))
            pricep.setText("15000");
        if(source.equalsIgnoreCase("India") && destination.equalsIgnoreCase("NewYork"))
            pricep.setText("20000");
        if(source.equalsIgnoreCase("Paris") && destination.equalsIgnoreCase("India"))
            pricep.setText("18000");
        if(source.equalsIgnoreCase("NewYork") && destination.equalsIgnoreCase("London"))
            pricep.setText("14000");
        if(source.equalsIgnoreCase("NewYork") && destination.equalsIgnoreCase("Moscow"))
            pricep.setText("15000");
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
     @FXML
    public void payment(ActionEvent event) throws IOException 
    {
        if(event.getSource()==payment)
        {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Scene11.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
    public void walletAdd(String money,String name, String source, String destination,String date) throws IOException
    {
        wallet.setText(money); 
        namep.setText(name);
        sourcep.setText(source);
        destinationp.setText(destination);
        datep.setText(date);
        if(source.equalsIgnoreCase("Kolkata") && destination.equalsIgnoreCase("Bangalore"))
            pricep.setText("4000");
        if(source.equalsIgnoreCase("Kolkata") && destination.equalsIgnoreCase("Delhi"))
            pricep.setText("4500");
        if(source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Kolkata"))
            pricep.setText("4500");
        if(source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Indore"))
            pricep.setText("3500");
        if(source.equalsIgnoreCase("Indore") && destination.equalsIgnoreCase("Delhi"))
            pricep.setText("3500");
        if(source.equalsIgnoreCase("India") && destination.equalsIgnoreCase("Dubia"))
            pricep.setText("15000");
        if(source.equalsIgnoreCase("India") && destination.equalsIgnoreCase("NewYork"))
            pricep.setText("20000");
        if(source.equalsIgnoreCase("Paris") && destination.equalsIgnoreCase("India"))
            pricep.setText("18000");
        if(source.equalsIgnoreCase("NewYork") && destination.equalsIgnoreCase("London"))
            pricep.setText("14000");
        if(source.equalsIgnoreCase("NewYork") && destination.equalsIgnoreCase("Moscow"))
            pricep.setText("15000");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
