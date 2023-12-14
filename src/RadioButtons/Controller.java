
package RadioButtons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;


public class Controller  {

    @FXML
    private Label myLabel;
    
    @FXML
    private RadioButton rb1;
    
    @FXML
    private RadioButton rb2;
    
    @FXML
    private RadioButton rb3;
    
    
    public void getFood(ActionEvent event){
        if(rb1.isSelected()){
            myLabel.setText("Your Bhat is on the Way !!");
        }else if(rb2.isSelected()){
            myLabel.setText("Your Dal is on the Way !!");
        }else if(rb3.isSelected()){
            myLabel.setText("Your Bhat is on the Way !!");
        }
    }
    
}
