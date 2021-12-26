/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Karyawan {
    String kodeKaryawan;
    String namaKaryawan;
    String alamat;
    LocalDate tanggalLahir;
    String golongan;
    int statusMenikah;
    int jumlahAnak;
    
    Scanner input = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    Karyawan(String kode, String nama, String almt, LocalDate ttl, String gol, int status, int anak) {
        this.kodeKaryawan = kode;
        this.namaKaryawan = nama;
        this.alamat = almt;
        this.tanggalLahir = ttl;
        this.golongan = gol;
        this.statusMenikah = status;
        this.jumlahAnak = anak;
    }
}
