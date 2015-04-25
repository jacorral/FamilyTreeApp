/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familytreeapp;

import daBandit.com.FamilyMember;
import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;

/**
 *
 * @author angel
 */
public class FXMLFamilyTreeController implements Initializable {
    public FamilyMember angel;
    public FamilyMember maria;
    public FamilyMember jessie;
    public FamilyMember yola;
    public FamilyMember edgar;
    public FamilyMember eric;
    public FamilyMember cisco;
    public ObservableList mariaChildren;
    private TreeItem<FamilyMember> root;
    public  Node rootIcon;
    
    
    @FXML
    private TreeView<FamilyMember> familyTreeView;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // Image test = ;
        rootIcon = new ImageView("resources/Leaf.png");
        buildList();
        buildTree();
        
        
        
        
    }   
    public void buildList(){
        maria = new FamilyMember("Maria", "Francisco", "61");
        angel = new FamilyMember("Angel", "none", "43");
        jessie = new FamilyMember("Jessie", "none", "42");
        yola = new FamilyMember("Yola", "Jose", "41");
        edgar = new FamilyMember("Edgar", "Lucy", "35");
        eric = new FamilyMember("Eric", "none", "30");
        cisco = new FamilyMember("Cisco", "none", "28");
        
        mariaChildren = FXCollections.observableArrayList();
        mariaChildren.addAll(angel, jessie, yola, edgar, eric, cisco);
        maria.setChildren(mariaChildren);
        System.out.println(maria.toString());
        
       
       
        
        
    }
    
    public void buildTree(){
        //FamilyMember angel = new FamilyMember("Angel Corral","none", "43");
         
         
        root = new TreeItem<>(maria, rootIcon);
        System.out.println(maria.toString());
        TreeItem<FamilyMember> angelTree = new TreeItem<>(angel);
        TreeItem<FamilyMember> jessieTree = new TreeItem<>(jessie);
        familyTreeView.setRoot(root);
        root.getChildren().addAll(angelTree, jessieTree);
        
    }
    
}
