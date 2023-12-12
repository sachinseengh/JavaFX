
package Eventhandlingg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
@FXML
//load everything from fxml file to controller
private Circle myCircle;
private double x;
private double y;
    
    public void up(ActionEvent e){
//        System.out.print("Up");
myCircle.setCenterY(y-=10);
    }
    public void Right(ActionEvent e){
//        System.out.print("Right");
myCircle.setCenterX(x+=10);
    }
    public void Down(ActionEvent e){
//        System.out.print("Down");
myCircle.setCenterY(y+=10);
    }
    public void Left(ActionEvent e){
//        System.out.print("Left");
myCircle.setCenterX(x-=10);
    }
  
    public static void main(String args[]) {
    
    }
}
