/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Spinner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 * FXML Controller class
 *
 * @author sachi
 */
public class FXMLController implements Initializable {
@FXML
private Spinner<Integer> mySpinner;

@FXML
private Label myLabel;

int currentValue;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        SpinnerValueFactory<Integer> valueFactory = 
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
        
        valueFactory.setValue(1);
        
        mySpinner.setValueFactory(valueFactory);
        
        

        
        mySpinner.valueProperty().addListener(new ChangeListener<Integer>(){
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
            
            
            
            
        currentValue = mySpinner.getValue();
        myLabel.setText(Integer.toString(currentValue));
            
            }
            
        });
    }    
    
}
