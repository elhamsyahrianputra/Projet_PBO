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
public final class Platinum extends Gold{
    
    // Attribute
        int pulsa;
    
        
    // Constractor
        public Platinum(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
            super(id, nama, jenis, pinjam, kembali);
            this.biayaSewa = 45000;
            this.discount = 0.003;
            this.cashback = 10000;
            this.pulsa = 5000;
        }
        
        
    // Method
        // Method untuk menghitung total bonus pulsa yang didapatkan berdasarkan lama waktu peminjaman
        int totalPulsa() {
            int total = this.lamaSewa() * this.pulsa;
            return total;
        }
         // Method untuk menampilkan data member, data peminjaman serta rincian biaya
        void tampilData() {
            System.out.println(
                "ID Member : " + this.idMember + "\n" +
                "Nama Member : " + this.namaMember + "\n" +
                "Jenis Member : " + this.jenisMember + "\n" +
                "\n" +
                "Tanggal Pinjam : " + this.tglPinjam.getDayOfMonth() + "-" + this.tglPinjam.getMonthValue() + "-" + this.tglPinjam.getYear() +  "\n" +
                "Tanggal Kembali : " + this.tglKembali.getDayOfMonth() + "-" + this.tglKembali.getMonthValue() + "-" + this.tglKembali.getYear() +  "\n" +
                "Lama Sewa : " + this.lamaSewa() + " Hari \n" +
                "\n" +
                "Total Sewa : Rp. " + this.totalSewa() + "\n" +
                "Jumlah Point : " + this.totalPoint() + "\n" +
                "Jumlah Cashback Rp. : " + this.cashback + "\n" +
                "Bonus Pulsa : Rp." + this.totalPulsa()
            );
        }
}
