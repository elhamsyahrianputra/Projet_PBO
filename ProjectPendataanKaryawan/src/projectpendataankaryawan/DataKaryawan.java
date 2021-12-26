/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class DataKaryawan {
    
    Scanner input = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
     
    void tambahData(Karyawan data){
        this.dataKaryawan.add(data);
    }
     
    void hapusData(String kode){
        this.dataKaryawan.removeIf(item -> item.kodeKaryawan.equals(kode));
    }
     
        
    void tampilData(){    
        System.out.println("===================");
        System.out.println("DATA KARYAWAN");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("KODE KARY\tNAMA KARY\tGOL\tUSIA\tSTATUS NIKAH\tJUMLAH ANAK");
        System.out.println("-------------------------------------------------------------------------------");       
        for(Karyawan item: this.dataKaryawan){
            int usia = (int) ChronoUnit.YEARS.between(item.tanggalLahir, LocalDate.now());
            System.out.println( item.kodeKaryawan + "\t\t" + item.namaKaryawan + "\t\t" + item.golongan + "\t" + usia + "\t" + item.statusMenikah + "\t\t" + item.jumlahAnak);
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Jumlah Data : " + this.dataKaryawan.size());
    }
    
    void cariData(String kode){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.dataKaryawan.size(); i++){
            if (this.dataKaryawan.get(i).kodeKaryawan.equals(kode)){
                index = i;
                ditemukan = true;
            }
        }
         
        if (ditemukan == true){
            Karyawan item = this.dataKaryawan.get(index);           
            
            int usia = (int) ChronoUnit.YEARS.between(item.tanggalLahir, LocalDate.now());
            
            String menikah;
            if (item.statusMenikah == 1) {
                menikah = "Menikah";
            } else {
                menikah = "Belum Menikah";
            }
            
          
            
            System.out.println("=======================================");
            System.out.println("DATA PROFILE KARYAWAN");
            System.out.println("----------------------------------------");
            System.out.println("Kode Karyawan\t\t: " + item.kodeKaryawan);
            System.out.println("Nama Karyawan\t\t: " + item.namaKaryawan);
            System.out.println("Golongan\t\t: " + item.golongan);
            System.out.println("Usia\t\t\t: " + usia);
            System.out.println("Status Menikah\t\t: " + menikah);
            System.out.println("Jumlah Anak\t\t: " + item.jumlahAnak);
            System.out.println("----------------------------------------");
            System.out.println("Gaji Pokok\t\t: ");
            System.out.println("Tunjangan Suami/Istri\t: ");
            System.out.println("Tunjangan Pegawai\t: ");
            System.out.println("Tunjangan Anak\t\t: ");
            System.out.println("----------------------------------------");
            System.out.println("Gaji Kotor\t\t: ");
            System.out.println("Potongan\t\t: ");
            System.out.println("----------------------------------------");
            System.out.println("Gaji Bersih\t\t: ");
            System.out.println("");
        } else {
            System.out.println("Data Karyawan tidak ditemukan");
        }
    }
    
    
}
