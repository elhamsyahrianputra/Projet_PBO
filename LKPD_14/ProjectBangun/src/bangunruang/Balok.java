/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Asus
 */
public class Balok extends BangunRuang{
   
    // Attribute
    public double panjang;
    public double lebar;
    public double tinggi;
    
    // Method
    
    @Override
    public double hitungVolume() {
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luas = 2 * ((this.panjang * this.lebar) + (this.lebar * this.tinggi) + (this.tinggi * this.panjang));
        return luas;
    }
    
    
    
}
