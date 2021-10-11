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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersegiPanjang pp = new PersegiPanjang();
            pp.hitungLuas(10, 5);
            pp.hitungLuas(3.6, 8);
            pp.hitungLuas(6, 8.3);
            pp.hitungLuas(5.6, 8.8);
        
        Persegi p = new Persegi();
            p.hitungLuas(4.5);
            p.hitungLuas(7);
       
        Lingkaran L = new Lingkaran();
            L.hitungLuas(5);
            L.hitungLuas(7.4);
        
        Segitiga s = new Segitiga();
            s.hitungLuas(8, 10);
            s.hitungLuas(8, 11.5);
            s.hitungLuas(12.2, 9);
            s.hitungLuas(13.9, 20.7);
        
    }
    
}
