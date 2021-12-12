/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

import java.text.DecimalFormat;
/**
 *
 * @author Asus
 */
public class Sedan extends Mobil {
    
    // Attribute
        // Nama Mobil
        String nama;
        
        // Kecapatan rata-rata dalam Km/jam
        double kecepatan;
        
        // Jarak yang ditempuh dalam perjalanan
        double jauhPerjalanan;
        
        // Jarak yang bisa ditempuh mobil dengan 1 liter bahan bakar dalam Km
        private double jarakTempuh = 10;
        
    public Sedan(String nama, int kecepatan, int perjalanan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.jauhPerjalanan = perjalanan;
    }

    @Override
    public double hitungBahanBakar(){
        double bahanBakar = this.jauhPerjalanan / this.jarakTempuh;
        return bahanBakar;
    }
    
    @Override
    public double hitungWaktuTempuh(){
        double waktu = this.jauhPerjalanan / this.kecepatan;
        return waktu;
    }
    
    public void tampilHasil () {
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("Nama Mobil : " + this.nama);
        System.out.println("Jenis Mobil : Sedan");
        System.out.println("Kecepatan Rata-rata : " + this.kecepatan + " Km/jam");
        System.out.println("Jarak yang ditempuh : " + this.jauhPerjalanan + " Km");
        System.out.println("Bahan bakar yang diperlukan dalam perjalanan ini adalah " + this.hitungBahanBakar() + " Liter");
        System.out.println("Waktu yang dihabiskan dalam perjalanan ini adalah " + df.format(this.hitungWaktuTempuh()) + " Jam");
    }
     
}
