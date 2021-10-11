/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    void hitungLuas(int p, int l) {
        int luas = p * l;
         System.out.println("Luas Persegi Panjang dengan panjang " + p + " dan lebar " + l + " adalah : " + luas);
    }
    
    void hitungLuas(int p, double l) {
        double luas = p * l;
        System.out.println("Luas Persegi Panjang dengan panjang " + p + " dan lebar " + l + " adalah : " + luas);
    }
    
    void hitungLuas(double p, int l) {
        double luas = p * l;
        System.out.println("Luas Persegi Panjang dengan panjang " + p + " dan lebar " + l + " adalah : " + luas);
    }
    
    void hitungLuas(double p, double l) {
        double luas = p * l;
        System.out.println("Luas Persegi Panjang dengan panjang " + p + " dan lebar " + l + " adalah : " + luas);
    }
}
