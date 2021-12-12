/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

/**
 *
 * @author Asus
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sedan Kudus = new Sedan("A", 60, 155);
        Kudus.tampilHasil();
        System.out.println("");
        
        Sedan Jakarta = new Sedan("B", 65, 518);
        Jakarta.tampilHasil();
        System.out.println("");
        
        SUV Banten = new SUV("C", 57, 660);
        Banten.tampilHasil();
        System.out.println("");
        
        SUV Bandung = new SUV("D", 62, 532);
        Bandung.tampilHasil();
        System.out.println("");
        
        MPV Banyuwangi = new MPV("E", 64, 540);
        Banyuwangi.tampilHasil();
        System.out.println("");
        
        MPV Jember = new MPV("F", 53, 431);
        Jember.tampilHasil();
        
    }
    
}
