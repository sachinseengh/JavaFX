/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


public class Controller implements Initializable {

    
    @FXML
    private ChoiceBox myChoiceBox;
    
    @FXML
    
    private Label myLabel;
    
    
    String []arr={"Pizza","Burger","MoMo"};

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        myChoiceBox.getItems().addAll(arr);

//        myChoiceBox.setOnAction(this::getFood);
    }    
    
    public void getFood(ActionEvent e){
        String myFood =(String) myChoiceBox.getValue();
        myLabel.setText(myFood);
    }
}
