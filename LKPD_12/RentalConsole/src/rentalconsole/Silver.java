/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.time.LocalDate;
/**
 *
 * @author Asus
 */

public class Silver extends Membership{
    
    // Attribute
        int biayaSewa;
        double discount;
        int point;
        
    
    // Constractor
        public Silver(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
            super(id, nama, jenis, pinjam, kembali);
            this.biayaSewa = 25000;
            this.discount = 0.001;
            this.point = 1;
        }
        
        
    // Method
        // Method untuk menghitung jumlah biaya sewa berdasarkan lama waktu peminjaman.
        private int hitungSewa() { 
            int sewa = this.lamaSewa();
            int biaya = sewa * this.biayaSewa;
            return biaya;
        }
        
        // Method untuk menghitung total discount yang didapatkan berdasarkan jumlah biaya sewa
        private double hitungDiscount(){
            double potongan = this.hitungSewa() * this.discount;
            return potongan;
        }
        
        // Method untuk menghitung total biaya sewa setelah dipotong dengan discount
        double totalSewa() {
            double total = this.hitungSewa() - this.hitungDiscount();
            return total;
        }
        
        // Method untuk menhitung total point yang didapatkan berdasarkan lama waktu peminjaman
        int totalPoint() {
            int total = this.point * this.lamaSewa();
            return total;
        }
        
         // Method untuk menampilkan data member, data peminjaman, serta rincia biaya
        void tampilData() {
            System.out.println(
                "ID Member : " + this.idMember + "\n" +
                "Nama Member : " + this.namaMember + "\n" +
                "Jenis Member : " + this.jenisMember + "\n" +
                "\n" +
                "Tanggal Pinjam : " + this.tglPinjam.getDayOfMonth() + "-" + this.tglPinjam.getMonthValue() + "-" + this.tglPinjam.getYear() +  "\n" +
                "Tanggal Kembali : " + this.tglKembali + "\n" +
                "Lama Sewa : " + this.lamaSewa() + " Hari \n" +
                "\n" +
                "Total Sewa : Rp. " + this.totalSewa() + "\n" +
                "Jumlah Point : " + this.totalPoint() + "\n"
            );
        }
    
}
