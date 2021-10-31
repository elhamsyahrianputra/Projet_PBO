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
public class PerhitunganBiaya {
 
// Attribute
    
    // Biaya sewa mobil per 5 Km
    int Biayasewa = 700000;
    
    // Harga Kelapa per buah
    int Hargakelapa = 8000;
    
    // Jumlah Kelapa yang dipesan
    int Jumlahkelapa;
    
    // Jarak tempuh ke kota
    int Jarak;

    
// Constructor
    PerhitunganBiaya(int jarak, int jumlah) {
        this.Jarak = jarak;
        this.Jumlahkelapa = jumlah;
    }

    
    
// Method
    
    // Menghitung Total biaya membeli kelapa untuk setiap pesanan
    int totalBeliKelapa() {
        
        int total = this.Hargakelapa * this.Jumlahkelapa;
        return total;
    }
    
    
    // Menghitung Total biaya sewa yang dikeluarkan untuk setiap pesanan
    double totalBiayaSewa() {
        
        Transportasi tp = new Transportasi(this.Jumlahkelapa);
        
        double total = (this.Jarak / 5) * this.Biayasewa * (tp.totalPengantaran(this.Jumlahkelapa));
        return total;
    }
    
    
    // Menghitung Total biaya yang dikeluarkan untuk mengantarkan pesanan {
    
    double totalBiaya() {
        
        double total =  totalBiayaSewa() + totalBeliKelapa();
        return total;
    }
    
    
    
}
