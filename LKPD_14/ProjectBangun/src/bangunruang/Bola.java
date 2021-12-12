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
public class Bola extends BangunRuang {
    
    // Attribute
    public double jariJari;
    
    @Override
    public double hitungVolume(){
        double volume = (4 * 3.14 * this.jariJari * this.jariJari * this.jariJari) / 3 ;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luas = 4 * 3.14 * this.jariJari * this.jariJari;
        return luas;
    }
    
    
}
