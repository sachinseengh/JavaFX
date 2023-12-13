
package Checkboxx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
@FXML
private Label myLabel;

@FXML
private CheckBox myCheckBox;

@FXML
private ImageView myImageView;
   
Image image1= new Image(getClass().getResourceAsStream("bulb-1.png")); 
Image image2= new Image(getClass().getResourceAsStream("bulb-2.png")); 

public void change(ActionEvent event) {
    try{
		
		if(myCheckBox.isSelected()) {
			myLabel.setText("ON");
                                                myImageView.setImage(image2);
			
		}
		else {
			myLabel.setText("OFF");
                                                myImageView.setImage(image1);
			
		}
	
}catch(Exception e){
    e.printStackTrace();
}
}
}

