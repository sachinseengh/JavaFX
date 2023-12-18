/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package TreeView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author sachi
 */
public class FXMLController implements Initializable {
  
    @FXML
    private TreeView myTreeView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        TreeItem<String> rootItem = new TreeItem<>("Files");
        
        
        TreeItem<String> branch1= new TreeItem<>("Desktop");
        TreeItem<String> branch2= new TreeItem<>("Documents");
        TreeItem<String> branch3= new TreeItem<>("Downloads");
        
        TreeItem<String> leaf1= new TreeItem<>("Desktop");
        TreeItem<String> leaf2= new TreeItem<>("Documents");
        TreeItem<String> leaf3= new TreeItem<>("Downloads");
      
        
          TreeItem<String> leaf4= new TreeItem<>("Desktop");
        TreeItem<String> leaf5= new TreeItem<>("Documents");
        TreeItem<String> leaf6= new TreeItem<>("Downloads");
        
        
        
  
        
        branch1.getChildren().addAll(leaf1,leaf2);
        branch2.getChildren().addAll(leaf3,leaf4);
        branch3.getChildren().addAll(leaf5,leaf6);
        
        rootItem.getChildren().addAll(branch1,branch2,branch3);
        myTreeView.setRoot(rootItem);
    }    
    
    public void selectItem(){
              TreeItem<String> selected=(TreeItem<String>) myTreeView.getSelectionModel().getSelectedItem();
              
              if(selected != null){
              System.out.print(selected.getValue());
              }
    }
    
}
