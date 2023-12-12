
package logout_exit;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javafx.stage.Stage;


public class Logout_Exit extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      
        
        
        
        Parent root =FXMLLoader.load(getClass().getResource("Main.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        //if we click the close butoon red x on top right corner then
        primaryStage.setOnCloseRequest(event ->  {
        
        event.consume();
        logout(primaryStage);
        
        
        });
    }
      public void logout(Stage stage){
      
      //For Confirmation
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Logout");
      alert.setHeaderText("You are about to logout!");
      alert.setContentText("Do you want to save before exiting?");
      
      
      
      
      
      if(alert.showAndWait().get() == ButtonType.OK){
       
       System.out.println("You Successfully logged out!");
       stage.close();
      }
  }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
