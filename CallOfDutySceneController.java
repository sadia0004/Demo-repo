/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CallOfDutySceneController implements Initializable {

    @FXML
    private ComboBox<String> weapenTypeComboBox;
    @FXML
    private TextField modelTextField;
    @FXML
    private TextField unitPriceTextField;
    @FXML
    private CheckBox isDoubleEagedCB;
    @FXML
    private ComboBox<Integer> magazineCapacityComboBox;
    @FXML
    private TextField blustRadiusTextField;
    @FXML
    private RadioButton sowrdRadioButton;
    @FXML
    private RadioButton GrenadeRadioButton;
    @FXML
    private RadioButton pistolRadioButton;
    @FXML
    private RadioButton allweaponRadioButton;
    @FXML
    private TableView<TableViewDummyClass> Tableview;
    @FXML
    private TableColumn<TableViewDummyClass, String> weaponInfoCol;
    
     ToggleGroup tg;
     
     
     ArrayList<Weapon> weaponList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        weaponList=new  ArrayList<Weapon>();
        
        weapenTypeComboBox.getItems().addAll("Sowrd","Pistol","Grenade");
         magazineCapacityComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        
         tg= new ToggleGroup();
         sowrdRadioButton.setToggleGroup(tg);
         GrenadeRadioButton.setToggleGroup(tg);
         pistolRadioButton.setToggleGroup(tg);
         allweaponRadioButton.setToggleGroup(tg);
         
         isDoubleEagedCB.setDisable(true);
         magazineCapacityComboBox.setDisable(true);
         blustRadiusTextField.setDisable(true);
         
         
         
         
         weaponInfoCol.setCellValueFactory(new PropertyValueFactory<TableViewDummyClass, String>("colval"));
         
        
        
        
        
       
    }    

    @FXML
    private void selectweaponComboBoxButtonOnClicked(ActionEvent event) {
        
        if (weapenTypeComboBox.getValue().equals("Sowrd")) {
            isDoubleEagedCB.setDisable(false);
            magazineCapacityComboBox.setDisable(true);
            blustRadiusTextField.setDisable(true);

        }else if(weapenTypeComboBox.getValue().equals("Pistol")){
            isDoubleEagedCB.setDisable(true);
            magazineCapacityComboBox.setDisable(false);
            blustRadiusTextField.setDisable(true);
            
            
        }else if(weapenTypeComboBox.getValue().equals("Grenade")){
            isDoubleEagedCB.setDisable(true);
            magazineCapacityComboBox.setDisable(true);
            blustRadiusTextField.setDisable(false);
            
            
        }

    }

    @FXML
    private void addWeaponInfoButtonOnClicked(ActionEvent event) {
        
       if (weapenTypeComboBox.getValue().equals("Sowrd")){
           weaponList.add(new Sowrd(isDoubleEagedCB.isSelected()
                   ,modelTextField.getText(),Float.parseFloat(unitPriceTextField.getText())));
           
       }else if(weapenTypeComboBox.getValue().equals("Pistol")){
           weaponList.add(new Pistol(magazineCapacityComboBox.getValue(), modelTextField.getText(),
                   Float.parseFloat(unitPriceTextField.getText())));
           
       }else if(weapenTypeComboBox.getValue().equals("Grenade")){
          weaponList.add(new Grenades(Float.parseFloat(blustRadiusTextField.getText()),
                  modelTextField.getText(),Float.parseFloat(unitPriceTextField.getText())) );
       }
       
       
       
       
    }

    @FXML
    private void overhaulWeaponButtonOnClicked(ActionEvent event) {
        for(Weapon w:weaponList){
            w.overhaul();
        }
       
    }

    @FXML
    private void showDetailsButtonOnClicked(ActionEvent event) {
        Tableview.getItems().clear();
        
        for (Weapon w : weaponList) {

            if (sowrdRadioButton.isSelected()) {

                if (w instanceof Sowrd) {
                    Tableview.getItems().add(new TableViewDummyClass(w.toString()));

                }

            } else if (GrenadeRadioButton.isSelected()) {
                if (w instanceof Grenades) {
                    Tableview.getItems().add(new TableViewDummyClass(w.toString()));

                }

            } else if (pistolRadioButton.isSelected()) {
                if (w instanceof Pistol) {
                    Tableview.getItems().add(new TableViewDummyClass(w.toString()));

                }

            }else if( allweaponRadioButton.isSelected()){
                Tableview.getItems().add(new TableViewDummyClass(w.toString()));
            }

        }
    }
}
