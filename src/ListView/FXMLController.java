/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ListView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author sachi
 */
public class FXMLController implements Initializable {

    @FXML
    private ListView myListView;
       
    @FXML
    private Label myLabel;
    
    
    String food[]={"Dhal","Bhat","Tarkari"};
    String currentValue;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       myListView.getItems().addAll(food);
       
       
//       myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
//           @Override
//           public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//             currentValue= (String) myListView.getSelectionModel().getSelectedItem();
//             
//             myLabel.setText(currentValue);
//           }
//           
//       
//       
//       
//       
//       });

     myListView.getSelectionModel().selectedItemProperty().addListener((observerable,oldValue,newValue)->{
       
       
        if(newValue != null){
           updateLabel((String) newValue);}
       
       });
    }

     private void updateLabel(String newValue) {
        myLabel.setText(newValue);
    } 
    
}
