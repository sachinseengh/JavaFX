
package TextFields;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Controller  {
 
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButoon;
    
    
    int age;
    
    public void submit(ActionEvent event){
        
        try{
        age= Integer.parseInt(myTextField.getText());
//        System.out.print(age);
        if(age>=18){
            myLabel.setText("You are Signed Up !!");
        }else{
            
           myLabel.setText("Your age must be 18 or more !!");
        }
        
        }catch(NumberFormatException e){
            myLabel.setText("Enter numerical Value !!!");
        }catch(Exception e){
            myLabel.setText("Error !!!");
        }
    }
  
}
