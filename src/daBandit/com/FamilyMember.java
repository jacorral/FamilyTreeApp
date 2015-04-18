/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daBandit.com;

import javafx.beans.property.ListProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author angel
 */
public class FamilyMember {
    public final StringProperty name = new SimpleStringProperty(this, "name", "");
    private final StringProperty spouse = new SimpleStringProperty(this, "spouse", "");
    private final LongProperty age = new SimpleLongProperty(this, "age", 0);
    private final ListProperty<FamilyMember> children = new SimpleListProperty<>();
    private final StringProperty nationality = new SimpleStringProperty(this, "nationality", "");
    private final StringProperty residence = new SimpleStringProperty(this, "residence", "");

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
   
    

    public long getAge() {
        return age.get();
    }

    public void setAge(long value) {
        age.set(value);
    }

    public LongProperty ageProperty() {
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
    
    public String toString(){
        return this.getName();
    }
    /*
    String name;
    String spouseName;
    int age = 0;
    List<FamilyMember> listOfChilder;
    String nationality;
    String residance; */
    
    
}
