package ChoiceBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> myChoiceBox;  // Specify the type of ChoiceBox

    @FXML
    private Label myLabel;

    String[] arr = {"Pizza", "Burger", "MoMo"};

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myChoiceBox.getItems().addAll(arr);

        // Add a listener to the ChoiceBox to handle changes
       myChoiceBox.getSelectionModel().selectedItemProperty().addListener((observerable,oldValue,newValue)->{
       
       
        if(newValue != null){
           updateLabel(newValue);}
       
       });
      
       
    }

  

    private void updateLabel(String newValue) {
        myLabel.setText(newValue);
    }
}
