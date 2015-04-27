/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daBandit.com;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author angel
 */
public class FamilyMember {
    public  final StringProperty name = new SimpleStringProperty(this, "name", "");
    private final StringProperty spouse = new SimpleStringProperty(this, "spouse", "");
    private final StringProperty age = new SimpleStringProperty(this, "age", "");
    private final ListProperty<FamilyMember> children = new SimpleListProperty<>(this, "children");
    private final StringProperty nationality = new SimpleStringProperty(this, "nationality", "US");
    private final StringProperty residence = new SimpleStringProperty(this, "residence", "IL");
    private final StringProperty parent = new SimpleStringProperty(this,"parent", "");

    public FamilyMember(String name, String spouse, String age) {
        this.setName(name);
        this.setSpouse(spouse);
        this.setAge(age);
        
        
    }

    public void setParent(String p){
        parent.set(p);
    }
    
    public String getParent(){
        return parent.get();
    }
    public StringProperty parentProperty(){
        return parent;
    }
    
    
    public String getResidence() {
        return residence.get();
    }

    public void setResidence(String value) {
        residence.set(value);
    }

    public StringProperty residenceProperty() {
        return residence;
    }
    
    

    public String getNationality() {
        return nationality.get();
    }

    public void setNationality(String value) {
        nationality.set(value);
    }

    public StringProperty nationalityProperty() {
        return nationality;
    }
    

    public ObservableList getChildren() {
        return children.get();
    }

    public void setChildren(ObservableList value) {
        children.set(value);
    }

    public ListProperty childrenProperty() {
        return children;
    }
   
    

    public String getAge() {
        return age.get();
    }

    public void setAge(String value) {
        age.set(value);
    }

    public StringProperty ageProperty() {
        return age;
    }
    

    public String getSpouse() {
        return spouse.get();
    }

    public void setSpouse(String value) {
        spouse.set(value);
    }

    public StringProperty spouseProperty() {
        return spouse;
    }
    

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
    public void printInfo(){
        System.out.println("Name:  " + this.nameProperty() + "\t\tAge: " + this.ageProperty());
        System.out.println("Spouse:  " + this.spouseProperty() + "\t\tNationality:  " + this.nationalityProperty());
        System.out.println("Residence:  " + this.residenceProperty());
        
    }
    /*
    String name;
    String spouseName;
    int age = 0;
    List<FamilyMember> listOfChilder;
    String nationality;
    String residance; */
    
    
}
