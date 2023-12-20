/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Animation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;



public class FXMLController implements Initializable {

     @FXML
     private ImageView myImage;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//      TranslateTransition translate = new TranslateTransition();
//      translate.setNode(myImage);
//      
//      
//      
////      It takes full 1000 milisec to complete the animation
//      translate.setDuration(Duration.millis(1000));
//      
//      
////      number of time it perform the transition
////      translate.setCycleCount(5);
//translate.setCycleCount(TranslateTransition.INDEFINITE);
//
//
//
//
////to reverse
//translate.setAutoReverse(true);
//      
////      Switches the position of image in x axis by 450
//      translate.setByX(450);
//      translate.play();
      

//-----------------------------------------------------------------------------------

//Rotate
      RotateTransition rotate = new RotateTransition();
      rotate.setNode(myImage);
//          
////      It takes full 1000 milisec to complete the animation
//      rotate.setDuration(Duration.millis(1000));      
//      
////      number of time it perform the transition
////      translate.setCycleCount(5);
       rotate.setCycleCount(TranslateTransition.INDEFINITE);
//
//
//       
//       
////       for smooth transition
rotate.setInterpolator(Interpolator.LINEAR);
//       
////      Switches the position of image in x axis by 450
      rotate.setByAngle(360);
//      
//      
//      
////      rotate on axis
////rotate.setAxis(Rotate.X_AXIS);
//rotate.setAxis(Rotate.Z_AXIS);
      rotate.play();




//fade----------------------------------------------------------------------
//FadeTransition fade = new FadeTransition();
//      fade.setNode(myImage);
//          
////      It takes full 1000 milisec to complete the animation
//      fade.setDuration(Duration.millis(1000));      
//      
////      number of time it perform the transition
////      translate.setCycleCount(5);
//       fade.setCycleCount(TranslateTransition.INDEFINITE);
//
//
//       
//       
////       for smooth transition
//fade.setInterpolator(Interpolator.LINEAR);
//       
//fade.setFromValue(0);
//fade.setToValue(1);
//      fade.play();



//Scale--------------------------------------------------------------------
ScaleTransition scale = new ScaleTransition();
      scale.setNode(myImage);
          
//      It takes full 1000 milisec to complete the animation
      scale.setDuration(Duration.millis(1000));      
      
//      number of time it perform the transition
//      translate.setCycleCount(5);
       scale.setCycleCount(TranslateTransition.INDEFINITE);


       
       
//       for smooth transition
scale.setInterpolator(Interpolator.LINEAR);
scale.setByX(2.0);
scale.setByY(2.0);


scale.setAutoReverse(true);

       

      scale.play();

    }    
    
}
