/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Asus
 */


public class Membership {
    
    // Attribute
        String idMember;
        String namaMember;
        String jenisMember;
        
        LocalDate tglPinjam;
        LocalDate tglKembali;
    
    // Constractor
        public Membership(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
            this.idMember = id;
            this.namaMember = nama;
            this.jenisMember = jenis;
            this.tglPinjam = pinjam;
            this.tglKembali = kembali;
        }
    
    // Method
        // Method untuk menghitung selisih hari Tanggal Pinjam dan Tanggal Kembali
       int lamaSewa() {
           int days = (int) ChronoUnit.DAYS.between(this.tglPinjam, this.tglKembali);
           int lamaSewa = days;
           return lamaSewa;
       }
       
       // Method untuk menampilkan data member dan data peminjaman
       void tampilData() {
           System.out.println(
                "ID Member : " + this.idMember + "\n" +
                "Nama Member : " + this.namaMember + "\n" +
                "Jenis Member : " + this.jenisMember + "\n" +
                "\n" +
                "Tanggal Pinjam : " + this.tglPinjam.getDayOfMonth() + "-" + this.tglPinjam.getMonthValue() + "-" + this.tglPinjam.getYear() +  "\n" +
                "Tanggal Kembali : " + this.tglKembali.getDayOfMonth() + "-" + this.tglKembali.getMonthValue() + "-" + this.tglKembali.getYear() +  "\n" +
                "Lama Sewa : " + this.lamaSewa() + " Hari"
           );
       }

}
