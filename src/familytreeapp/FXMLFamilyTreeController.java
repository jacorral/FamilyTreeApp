/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familytreeapp;

import daBandit.com.FamilyMember;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.function.Consumer;
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
    public FamilyMember fm;
    public ArrayList<FamilyMember> mChildren;
    public ObservableList mariaChildren;
    public ObservableList mariaChildrenTree;
    private TreeItem<FamilyMember> root;
    private TreeItem<FamilyMember> treeItem;
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
       // public ArrayList<FamilyMember> test = new ArrayList<>();
        mChildren = new ArrayList<>();
        
        mChildren.add(angel);
        mChildren.add(jessie);
        mChildren.add(yola);
        mChildren.add(edgar);
        mChildren.add(eric);
        mChildren.add(cisco);
        
        mariaChildren = FXCollections.observableArrayList();
        
        mariaChildren.addAll(mChildren);
        maria.setChildren(mariaChildren);
        System.out.println(maria.toString());
        
       
       
        
        
    }
    
    public void buildTree(){
        //FamilyMember angel = new FamilyMember("Angel Corral","none", "43");
         
         
        root = new TreeItem<>(maria, rootIcon);
        mariaChildrenTree = FXCollections.observableArrayList();
        System.out.println(maria.toString());
        /*
        TreeItem<FamilyMember> angelTree = new TreeItem<>(angel);
        TreeItem<FamilyMember> jessieTree = new TreeItem<>(jessie);
        TreeItem<FamilyMember> yolaTree = new TreeItem<>(yola);
        TreeItem<FamilyMember> edgarTree = new TreeItem<>(edgar);
        TreeItem<FamilyMember> ericTree = new TreeItem<>(eric);
        TreeItem<FamilyMember> ciscoTree = new TreeItem<>(cisco); */
        
        maria.getChildren().forEach(new Consumer<FamilyMember>() {

            @Override
            public void accept(FamilyMember fmt) {
                treeItem = new TreeItem<>(fmt);
                mariaChildrenTree.add(treeItem);
            }
        });
        
        /*
        for(FamilyMember fm : mChildren){
            treeItem = new TreeItem<>(fm);
            mariaChildrenTree.add(treeItem);   
        } */
        
        
        familyTreeView.setRoot(root);
        root.getChildren().addAll(mariaChildrenTree);
        
    }
    
}
