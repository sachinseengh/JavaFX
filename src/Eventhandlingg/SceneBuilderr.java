/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package Eventhandlingg;

import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;


import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;

public class SceneBuilderr extends Application {
    
    @Override
    public void start(Stage stage)  {
        try{      
Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
   

//    root= new Group();
        Scene scene = new Scene(root);
        
        //Linking external css file
        
//        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        //if we have more than one scene then store it into a string and reuse it
        String css = this.getClass().getResource("main.css").toExternalForm();
        scene.getStylesheets().add(css);
        
        
//        scene1.getStylesheets().add(css);
        
        stage.setScene(scene);
        stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
