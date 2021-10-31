/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author Asus
 */
public class Transportasi {
    
// Attribute
    
   
    // Maksmimal muatan mobil untuk mengangkut kelapa dalam Kg
    int Maksimalmuatan = 3000;
    
    // Jumlah berat kelapa yang dibawah dalam Kg
    int Jumlahkelapa;


// Contstractor
    Transportasi(int jumlah) {
        this.Jumlahkelapa = jumlah;
    }


// Method
    

    
    // Menghitung total pengantaran berdasarkan total berat kelapa yang diangkut
    double totalPengantaran(int jumlah) {
        this.Jumlahkelapa = jumlah;
        
        Kelapa klp = new Kelapa();
        
        double total = klp.totalBeratkelapa(jumlah) / this.Maksimalmuatan;
        return Math.ceil(total);
    }

}