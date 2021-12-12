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
public class Tabung extends BangunRuang {
    // Attribute
    public double jariJari;
    public double tinggi;
    
    // Method
    
    @Override
    public double hitungVolume() {
        double volume = (3.14 * this.jariJari * this.jariJari) * this.tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luas = 2 * 3.14 * this.jariJari * (this.jariJari + this.tinggi);
        return luas;
    }
    
}
