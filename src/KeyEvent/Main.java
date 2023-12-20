/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package KeyEvent;

import Eventhandlingg.Controller;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

import javafx.stage.Stage;

/**
 *
 * @author sachi
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
       FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml")); 
        
       
       Parent root = loader.load();
        
       FXMLController controller = loader.getController();
       
        Scene scene = new Scene(root);
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
              switch(event.getCode()){
                  
                  case UP:
                      controller.moveUp();
                      break;
                      
                  case DOWN:
                      controller.moveDown();
                      break;
                  case LEFT:
                      controller.moveLeft();
                      break;
                  case RIGHT:
                      controller.moveRight();
                      break;
                  
                    
              }
           }
        });
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
