/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familytreeapp;

import daBandit.com.FamilyMember;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 *
 * @author angel
 */
public class FXMLFamilyTreeController implements Initializable {
    private FamilyMember angel = new FamilyMember();
    private TreeItem<FamilyMember> root;
    
    
    @FXML
    private TreeView<FamilyMember> familyTreeView;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        buildTree();
        
        
        
        
    }   
    
    public void buildTree(){
        angel.setName("Angel");
        TreeItem<FamilyMember> angelTree = new TreeItem<>();
        root = new TreeItem<FamilyMember>(angel);
        
        familyTreeView.setRoot(root);
        
    }
    
}
