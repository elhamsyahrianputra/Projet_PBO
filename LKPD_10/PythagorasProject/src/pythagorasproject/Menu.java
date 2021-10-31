/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Asus
 */

import java.util.Scanner;

public class Menu {
    
// Attribute  
    int a;
    int b;
    int c;
    int option;

// Instansiasi
    Scanner input = new Scanner(System.in);
    Pythagoras pt = new Pythagoras();

// Method
    
    // Method untuk menampilkan list menu dan mengambil opsi yang dipilih user
    void menuPythagoras() {
        
        while (true) {
            // Menampilkan list menu aplikasi
            System.out.println(
                "1. Cek Triple Pythagoras \n" +
                "2. Menentukan Sisi Miring Segitiga \n" +
                "3. Menentukan Sisi Siku-Siku Segitiga \n" +
                "4. Exit \n");
            
            // Input untuk user memilih menu
            System.out.print("Pilih Menu : ");
            this.option = input.nextInt();  

            // Pengkondisan menggunakan switch
            switch (this.option) {

                // Kondisi bila user memilih menu no.1
                case 1:
                    System.out.print("Masukkan nilai a : ");
                    a = input.nextInt();

                    System.out.print("Masukkan nilai b : ");
                    b = input.nextInt();

                    System.out.print("Masukkan nilai c : ");
                    c = input.nextInt();

                    if (pt.hitungSisiMiring(a, b) == c) {
                        System.out.println("Ketiga bilangan tersebut merupakan Triple Pythagoras \n");
                    } else {
                        System.out.println("Ketiga bilangan tersebut bukan Triple Pythagoras \n");
                    }
                    break;

                // Kondisi bila user memilih menu no.2
                case 2:
                    System.out.print("Masukkan nilai a : ");
                    a = input.nextInt();

                    System.out.print("Masukkan nilai a : ");
                    b = input.nextInt();

                    System.out.println("Nilai c nya adalah : " + pt.hitungSisiMiring(a, b) + "\n");
                    break;

                // Kondisi bila user memilih menu no.3
                case 3:
                    System.out.print("Masukkan nilai a : ");
                    a = input.nextInt();

                    System.out.print("Masukkan nilai c : ");
                    c = input.nextInt();

                    System.out.println("Nilai b nya adalah : " + pt.hitungSisiSiku(a, c) + "\n");
                    break;

                // Kondisi bila user memilih menu no.4
                case 4:
                    System.out.println("Terima Kasih .....");
                    System.exit(0);

                // Kondisi bila user memasukkan nomor menu yang salah/tidak ada
                default:
                    System.out.println("Input yang anda masukkan tidak valid \n");
                    break;
            }
            
            System.out.println("-------------------------------------------------");
        }
    
    }
        
}

