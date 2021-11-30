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
        private int pulsa;
    
        public void setPulsa(int data) {
            this.pulsa = data;
        }
        
        public int getPulsa(int data) {
            return this.pulsa;
        }
        
    // Constractor
        public Platinum(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
            super(id, nama, jenis, pinjam, kembali);
            this.setBiayaSewa(45000);
            this.setDiscount(0.003);
            this.setCashback(10000);
            this.setPulsa(5000);
            this.setPoint(10);
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
                "ID Member : " + this.getID() + "\n" +
                "Nama Member : " + this.getNama() + "\n" +
                "Jenis Member : " + this.getJenis() + "\n" +
                "\n" +
                "Tanggal Pinjam : " + this.getTglPinjam().getDayOfMonth() + "-" + this.getTglPinjam().getMonthValue() + "-" + this.getTglPinjam().getYear() +  "\n" +
                "Tanggal Kembali : " + this.getTglKembali().getDayOfMonth() + "-" + this.getTglKembali().getMonthValue() + "-" + this.getTglKembali().getYear() +  "\n" +
                "Lama Sewa : " + this.lamaSewa() + " Hari \n" +
                "\n" +
                "Total Sewa : Rp. " + this.totalSewa() + "\n" +
                "Jumlah Point : " + this.totalPoint() + "\n" +
                "Jumlah Cashback Rp. : " + this.getCashback() + "\n" +
                "Bonus Pulsa : Rp." + this.totalPulsa()
            );
        }
}
