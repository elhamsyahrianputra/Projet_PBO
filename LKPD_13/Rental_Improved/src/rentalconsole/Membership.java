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
        private String idMember;
        private String namaMember;
        private String jenisMember;
        
        private LocalDate tglPinjam;
        private LocalDate tglKembali;
    
    // Constractor
        public Membership(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
            this.idMember = id;
            this.namaMember = nama;
            this.jenisMember = jenis;
            this.tglPinjam = pinjam;
            this.tglKembali = kembali;
        }
    
    // Method
        
        public String getID() {
            return this.idMember;
        }
        
        public String getNama() {
            return this.namaMember;
        }
        
        public String getJenis() {
            return this.jenisMember;
        }
        
        public LocalDate getTglPinjam() {
            return this.tglPinjam;
        }
        
        public LocalDate getTglKembali() {
            return this.tglKembali;
        }
        
        // Method untuk menghitung selisih hari Tanggal Pinjam dan Tanggal Kembali
       int lamaSewa() {
           int days = (int) ChronoUnit.DAYS.between(this.tglPinjam, this.tglKembali);
           int lamaSewa = days;
           return lamaSewa;
       }
       
       // Method untuk menampilkan data member dan data peminjaman
       void tampilData() {
           System.out.println(
                "ID Member : " + this.getID() + "\n" +
                "Nama Member : " + this.getNama() + "\n" +
                "Jenis Member : " + this.getJenis() + "\n" +
                "\n" +
                "Tanggal Pinjam : " + this.tglPinjam.getDayOfMonth() + "-" + this.tglPinjam.getMonthValue() + "-" + this.tglPinjam.getYear() +  "\n" +
                "Tanggal Kembali : " + this.tglKembali.getDayOfMonth() + "-" + this.tglKembali.getMonthValue() + "-" + this.tglKembali.getYear() +  "\n" +
                "Lama Sewa : " + this.lamaSewa() + " Hari"
           );
       }

}
