/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author USER
 */
public class Sowrd extends Weapon{
    
  private boolean isDoubleEdged;

    public Sowrd(boolean isDoubleEdged, String model, float price) {
        super(model, price);
        this.isDoubleEdged = isDoubleEdged;
    }
    
    
    @Override
    public void overhaul(){
        System.out.println("Sowrd is overhauled");
    }

    public boolean isIsDoubleEdged() {
        return isDoubleEdged;
    }

    public void setIsDoubleEdged(boolean isDoubleEdged) {
        this.isDoubleEdged = isDoubleEdged;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sowrd{" + "model=" + model + ", price=" + price  + "isDoubleEdged=" + isDoubleEdged + '}';
    }
  
  
   
    
    
}
