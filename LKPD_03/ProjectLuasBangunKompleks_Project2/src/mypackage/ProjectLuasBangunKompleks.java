/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Asus
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Hitung luas Lingkaran yang besar
            Lingkaran L = new Lingkaran();
            double lingkaranBesar = L.hitungLuas(14)/2;
        
        // Hitung luas lingkaran kecil
            double lingkaranKecil = L.hitungLuas(7)/2;
        
        // Hitung total luas bangun datar
            double luasTotal = lingkaranBesar - lingkaranKecil*2;
            System.out.println("Total luas bangun datar tersebut adalah: " + luasTotal);
    }
    
}
