/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package logout_exit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Controller {
@FXML
private Button logout;
  @FXML
  private AnchorPane scenepane;
  Stage stage;
  
  
  public void logout(ActionEvent event){
      
      //For Confirmation
      Alert alert = new Alert(AlertType.CONFIRMATION);
      alert.setTitle("Logout");
      alert.setHeaderText("You are about to logout!");
      alert.setContentText("Do you want to save before exiting?");
      
      
      
      
      
      if(alert.showAndWait().get() == ButtonType.OK){
       stage=(Stage) scenepane.getScene().getWindow();
       System.out.println("You Successfully logged out!");
       stage.close();
      }
  }
    
}
