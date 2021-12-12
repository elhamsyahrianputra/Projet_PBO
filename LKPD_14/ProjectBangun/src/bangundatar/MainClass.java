/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;
import bangunruang.*;

/**
 *
 * @author Asus
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Bangun Datar
        Persegi p = new Persegi();
        p.sisi = 8;
        p.hitungLuas();
        p.hitungKeliling();
        System.out.println("Persegi");
        p.tampilHasil();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 8;
        pp.lebar = 6;
        pp.hitungLuas();
        pp.hitungKeliling();
        System.out.println("Persgi Panjang");
        pp.tampilHasil();
        
        Lingkaran l = new Lingkaran();
        l.jariJari = 7;
        l.hitungLuas();
        l.hitungKeliling();
        System.out.println("Lingkaran");
        l.tampilHasil();
        
        
        // Bangun Ruang
        
        Balok balok = new Balok();
        balok.panjang = 10;
        balok.lebar = 8;
        balok.tinggi = 5;
        balok.hitungVolume();
        balok.hitungLuasPermukaan();
        System.out.println("Balok");
        balok.tampilHasil();
        
        Tabung tabung = new Tabung();
        tabung.jariJari = 7;
        tabung.tinggi = 10;
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();
        System.out.println("Tabung");
        tabung.tampilHasil();
        
        Bola bola = new Bola();
        bola.jariJari = 14;
        bola.hitungVolume();
        bola.hitungLuasPermukaan();
        System.out.println("Bola");
        bola.tampilHasil();
        
        
    }
    
}
