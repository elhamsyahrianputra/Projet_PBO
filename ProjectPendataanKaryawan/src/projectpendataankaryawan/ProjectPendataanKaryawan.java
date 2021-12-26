/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class ProjectPendataanKaryawan {
    
    
    
    

    public static void main(String[] args) {
        
        // Instansiasi
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DataKaryawan k = new DataKaryawan();
        
        k.tambahData(new Karyawan("M001", "Elham", "Rempanga",LocalDate.of(2002,04,22), "A", 1, 2)); 
        
        while(true) {
            System.out.println(
                  "1. Tambah Data\n"
                + "2. Hapus Data\n"
                + "3. Cari Data\n"
                + "4. Lihat Data\n"
                + "5. Exit\n");
            
            System.out.print("Menu pilihan : ");
            int pil = input.nextInt();
            input.nextLine();
           
            switch(pil) {
                case 1 :
                    System.out.print("Masukkan Kode Karyawan\t: ");
                    String kode = input.nextLine();

                    System.out.print("Masukkan Nama Karyawan\t: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan Alamat\t: ");
                    String alamat = input.nextLine();

                    System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD)\t: ");
                    String dateString = input.nextLine();
                    LocalDate date = LocalDate.parse(dateString, formatter);

                    System.out.print("Masukkan Golongan\t: ");
                    String gol = input.nextLine();

                    System.out.print("Masukkan Status Menikah\t: ");
                    int statusNikah = input.nextInt();
                    
                    int jumlahAnak = 0;
                    if (statusNikah == 1) {
                        System.out.print("Masukkan Jumlah Anak\t: ");
                        jumlahAnak = input.nextInt();
                    }
                    
                    k.tambahData(new Karyawan(kode, nama, alamat, date, gol, statusNikah, jumlahAnak));
                    
                case 2 :
                    System.out.print("Masukkan Kode Karyawan : ");
                    k.hapusData(input.nextLine());
                    break;
                    
                case 3 :
                    System.out.println("Masukkan Kode Karyawan : ");
                    k.cariData(input.nextLine());
                    break;
                    
                case 4 :
                    k.tampilData();
                    break;
                    
                case 5 :
                    System.out.println("Terima Kasih .....");
                    System.exit(0);
                    break;
                    
                default :
                    System.out.println("\nMaaf, Input yang dimasukkan tidak valid\n");
                    break;
            }
        }
        
    }
    
}
