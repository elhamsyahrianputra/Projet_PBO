/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

/**
 *
 * @author Asus
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListProject {
    
    // Attribute
    int option;
    
    
    // Instansiasi
    ArrayList<String> dataString = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    
    // Method
    
    void tambahData() {
        System.out.print("Masukkan Data String: ");
        this.dataString.add(input.nextLine());
        System.out.println("Daftar string dalam array list: " + this.dataString);
    }
    
    void cariData() {
        System.out.print("String yang mau dicari: ");
        String data = input.nextLine();
        
        int index = this.dataString.indexOf(data);
        
        if(index >= 0) {
           System.out.println("String " + data + " ada di index ke " + index); 
        } else {
            System.out.println("String " + data + " tidak ada dalam data");
        }
    }
    
    void hapusData() {
        System.out.print("String yang mau dihapus : ");
        String data =  input.nextLine();
        
        int index = this.dataString.indexOf(data);
        
        if (index >= 0) {
            this.dataString.remove(index);
            System.out.println("String " +data+ " sudah dihapus di dalam data");
        } else {
            System.out.println("String " +data+ " tidak ada dalam data");
        }
        System.out.println("Daftar string dalam array list: " + this.dataString);
    }
    
    void tampilData() {
        System.out.println("Daftar string dalam array list: " + this.dataString);
    }
    
    void tampilMenu() {
        while (true) {
            // Menampilkan list menu aplikasi
            System.out.println(
                "1. Tambah Data \n" +
                "2. Cari Data \n" +
                "3. Hapus data \n" +
                "4. Tampil Data \n" +
                "5. Keluar \n");

            // Input untuk user memilih menu
            System.out.print("Pilih nomor berapa : ");
            this.option = input.nextInt();  
            
            input.nextLine();

            // Pengkondisan menggunakan switch
            switch (this.option) {

                // Kondisi bila user memilih menu no.1
                case 1:
                    tambahData();
                    break;


                // Kondisi bila user memilih menu no.2
                case 2:
                    cariData();
                    break;


                // Kondisi bila user memilih menu no.3
                case 3:
                    hapusData();
                    break;

                // Kondisi bila user memilih menu no.4
                case 4:
                    tampilData();
                    break;

                // Kondisi bila user memilih menu no.5
                case 5:
                    System.out.println("Terima Kasih .....");
                    System.exit(0);

                // Kondisi bila user memasukkan nomor menu yang salah/tidak ada
                default:
                    System.out.println("Input yang anda masukkan tidak valid \n");
            }

            System.out.println("-------------------------------------------------");
        }
    }
}

