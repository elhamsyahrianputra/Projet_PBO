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
public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    PerhitunganBiaya Boyolali = new PerhitunganBiaya(15, 5000);
    PerhitunganBiaya Salatiga = new PerhitunganBiaya(35, 7500);
    PerhitunganBiaya Klaten = new PerhitunganBiaya(30, 8300);
    PerhitunganBiaya Kudus = new PerhitunganBiaya(75, 9100);
    
    // Mencari Harga Jual Kelapa berdasarkan Keuntungan yang ditetapkan
    
        // Total Kelapa Yang terjual
        int totalKelapa = Boyolali.Jumlahkelapa + Salatiga.Jumlahkelapa + Klaten.Jumlahkelapa + Kudus.Jumlahkelapa;
        
        // Total Biaya yang dikeluarga untuk membeli dan menyewa transportasi
        double totalBiaya = Boyolali.totalBiaya() + Salatiga.totalBiaya() + Klaten.totalBiaya() + Kudus.totalBiaya();
        
        // Keuntungan yang ditetapkan
        int Keuntungan = 15000000;

        double Hargajual = (totalBiaya + Keuntungan) / totalKelapa;
        System.out.println("Harga jual minimal kelapa yang harus ditetapkan Pak Amir agar mendapatkan Keuntungan  sebesar Rp." + Keuntungan + " yaitu senilai Rp." + Hargajual);
        
    }
}
