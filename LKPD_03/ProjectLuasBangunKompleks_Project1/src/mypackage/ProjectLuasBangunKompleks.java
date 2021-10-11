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
        
        // Definisikan panjang sisi
        int sisi = 42;

        // Hitung luas Persegi
        Persegi p = new Persegi();
        int luasPersegi = p.hitungLuas(sisi);

        // hitung luas setengah lingkaran;
        Lingkaran L = new Lingkaran();
        double luasLingkaran = L.hitungLuas(sisi/2)/2;
        
        // Menghitung total Luas
        double totalLuas = 4 * luasLingkaran + luasPersegi;
        System.out.println("TotaL luas dari bangun datar tersebut adalah: " + totalLuas);
               
    }
    
}

