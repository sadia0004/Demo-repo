/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author USER
 */
public class Pistol extends Weapon {
    private int magazineSize;

    public Pistol(int magazineSize, String model, float price) {
        super(model, price);
        this.magazineSize = magazineSize;
    }
    
    @Override
    public void overhaul(){
        System.out.println("Pistol is overhauled");
    }

    public int getMagazineSize() {
        return magazineSize;
    }

    public void setMagazineSize(int magazineSize) {
        this.magazineSize = magazineSize;
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
        return "Pistol{" + "model=" + model + ", price=" + price  + "magazineSize=" + magazineSize + '}';
    }
   
    
    
    
    
        

    
}
