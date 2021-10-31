/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

// Import
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Asus
 */
public class TebakAngka {
    
// Attribute
int angka;
    
// Method
    void tebakAngka() {
        
        Scanner input = new Scanner(System.in);
        
        // Pengenalan Program
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        
        // Menentukan angka yang akan ditebak
        this.angka = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        
        while(true) {
            // Input untuk user menebak angka
            System.out.print("Masukkan tebakan anda : ");
            int tebak = input.nextInt();
            
            // Kondisi jika tebakan user lebih besar dari angka tebakan
            if (tebak > this.angka) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar \n");
                
            // Kondisi jika tebakan user lebih kecil dari angka tebakan
            } else if (tebak < this.angka) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil \n");
            
            // Kondisi jika tebakan user sama dengan angka tebakan
            } else if (tebak == this.angka) {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR");
                System.exit(0);
            }
        }
              
    }
    
}
