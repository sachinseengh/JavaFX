/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package scenebuilderr;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.stage.Stage;

/**
 *
 * @author sachi
 */
public class SceneBuilderr extends Application {
    
    @Override
    public void start(Stage stage)  {
        try{
            
            
            
         
Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
   

//    root= new Group();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
