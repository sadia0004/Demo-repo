/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author USER
 */
public abstract class Weapon {
    protected String model;
    
    protected float price;

    public Weapon(String model, float price) {
        this.model = model;
        this.price = price;
    }
    
    public abstract void overhaul();

    
    
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
        return "Weapon{" + "model=" + model + ", price=" + price + '}';
    }
    
    
   

}