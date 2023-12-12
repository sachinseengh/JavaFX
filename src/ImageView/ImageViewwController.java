
package ImageView;

import java.awt.Button;


import javafx.fxml.FXML;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;


public class ImageViewwController  {

    
    
    //ImageView is a Node used for painting images loaded with Images
    
    
    //Image = picture
    //ImageView = picture
    @FXML
    ImageView myImageView;
    Button mybutton;
  
  Image image = new Image(getClass().getResourceAsStream("pic-1.jpg"));
    
    public void displayImage(){
        myImageView.setImage(image);
    }
}
