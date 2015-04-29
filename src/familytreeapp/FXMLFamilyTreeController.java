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
    public FamilyMember destiny;
    public FamilyMember briana;
    public FamilyMember edgar;
    public FamilyMember favian;
    public FamilyMember bella;
    public FamilyMember eli;
    public FamilyMember eric;
    public FamilyMember cisco;
    public FamilyMember fm;
    public ArrayList<FamilyMember> mChildren;
    public ArrayList<FamilyMember> yChildren;
    public ArrayList<FamilyMember> eChildren;
    public ObservableList mariaChildren;
    public ObservableList yolaChildren;
    public ObservableList edgarChildren;
    public ObservableList mariaChildrenTree;
    public ObservableList yolaChildrenTree;
    public ObservableList edgarChildrenTree;
    private TreeItem<FamilyMember> root;
    private TreeItem<FamilyMember> treeItem;
    private TreeItem<FamilyMember> sTreeItem;
    public  Node rootIcon;
    
    
    @FXML
    private TreeView<FamilyMember> familyTreeView;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // Image test = ;
        rootIcon = new ImageView("resources/Sheriff.png");
        buildList();
        buildTree();
        
        
        
        
    }   
    
    
    public void buildList(){
        //***  Root node data
        maria = new FamilyMember("Maria", "Francisco", "61");
        angel = new FamilyMember("Angel", "none", "43");
        angel.setParent(maria.getName());
        angel.childrenProperty().clear();
        jessie = new FamilyMember("Jessie", "none", "42");
        jessie.setParent(maria.getName());
        jessie.childrenProperty().clear();
        yola = new FamilyMember("Yola", "Jose", "41");
        yola.setParent(maria.getName());
        edgar = new FamilyMember("Edgar", "Lucy", "35");
        edgar.setParent(maria.getName());
        eric = new FamilyMember("Eric", "none", "30");
        eric.setParent(maria.getName());
        eric.childrenProperty().clear();
        cisco = new FamilyMember("Cisco", "none", "28");
        cisco.setParent(maria.getName());
        cisco.childrenProperty().clear();
        
        // Building edgar node
        edgar.setSpouse("Lucy");
        favian = new FamilyMember("Favian", "none", "9");
        bella = new FamilyMember("Bella", "none", "5");
        eli = new FamilyMember("Eli", "none", "2");
        eChildren = new ArrayList<>();
        eChildren.add(favian);
        eChildren.add(bella);
        eChildren.add(eli);
        //eChildren.add(new FamilyMember("test","test", "5"));
        
        edgarChildren = FXCollections.observableArrayList();
        edgarChildren.addAll(eChildren);
        edgar.setChildren(edgarChildren);
        
        // Building yola node
        
        yola.setSpouse("Jose");
        destiny = new FamilyMember("Destiny", "none", "17");
        briana = new FamilyMember("Briana", "none", "13");
        yChildren = new ArrayList<>();
        yChildren.add(destiny);
        yChildren.add(briana);
        
        yolaChildren = FXCollections.observableArrayList();
        yolaChildren.addAll(yChildren);
        yola.setChildren(yolaChildren);
        
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
        yolaChildrenTree = FXCollections.observableArrayList();
        System.out.println(maria.toString());
        
       
         maria.getChildren().forEach(new Consumer<FamilyMember>() {

            @Override
            public void accept(FamilyMember fmt) {
                System.out.println(fmt.getName());
                
                if(!fmt.childrenProperty().isEmpty()){
                treeItem = new TreeItem<>(fmt, new ImageView("resources/Sheriff.png"));
                mariaChildrenTree.add(treeItem);
                //Add a way to get the treeItem fmt list of children and make treeItems
                // to add to the treeView
                fmt.getChildren().forEach(new Consumer<FamilyMember>(){
                    
                    @Override
                    public void accept(FamilyMember cmt){
                        sTreeItem = new TreeItem<>(cmt,new ImageView("resources/Hat_cowboy_black.png"));
                        System.out.println(cmt.getName());
                        
                       treeItem.getChildren().add(sTreeItem);
                        
                    }
                });
                //yola.getChildren().addAll(yolaChildrenTree);
                }else{
                treeItem = new TreeItem<>(fmt, new ImageView("resources/Hat_cowboy_brown.png"));
                mariaChildrenTree.add(treeItem);
                }
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
