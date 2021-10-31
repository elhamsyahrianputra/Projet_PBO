/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Asus
 */


public class Pythagoras {
    
// Method
    
    // Rumus menghitung Sisi Miring Segitiga
    double hitungSisiMiring(int a, int b) {
        double sisiMiring = Math.sqrt(a*a + b*b);
        return sisiMiring;
    }
    
    // Rumus Menghitung Sisi Siku Segitiga
    double hitungSisiSiku(int a, int c) {
        double sisiSiku = Math.sqrt(c*c - a*a);
        return sisiSiku;
    }
        
}
