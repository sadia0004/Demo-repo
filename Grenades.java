/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author USER
 */
public class Grenades extends Weapon {

    private float blustRadiusInMeter;

    public Grenades(float blustRadiusInMeter, String model, float price) {
        super(model, price);
        this.blustRadiusInMeter = blustRadiusInMeter;
    }
    
    
    @Override
    public void overhaul(){
        System.out.println("Grenades is overhauled");
    }

    public float getBlustRadiusInMeter() {
        return blustRadiusInMeter;
    }

    public void setBlustRadiusInMeter(float blustRadiusInMeter) {
        this.blustRadiusInMeter = blustRadiusInMeter;
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
        return "Grenades{"  + "model=" + model + ", price=" + price + "blustRadiusInMeter=" + blustRadiusInMeter + '}';
    }
    
    

}
