
package DatePicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {
 
 @FXML
 private DatePicker myDatePicker;
 @FXML
 private Label myLabel;
 
 public void getDate(ActionEvent event) {
  
     
     try{
  LocalDate myDate = myDatePicker.getValue();
  String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
  myLabel.setText(myFormattedDate);
     }catch(Exception e){
         e.printStackTrace();
     }
 }
}
