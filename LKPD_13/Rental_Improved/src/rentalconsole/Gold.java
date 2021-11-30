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
public class Gold extends Silver{
    
    // Attribute
       private  int cashback;
        
        public void setCashback(int data) {
            this.cashback = data;
        }
        
        public int getCashback() {
           return this.cashback;
        }
    
    // Constractor
        public Gold(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
            super(id, nama, jenis, pinjam, kembali);
            this.setBiayaSewa(30000);
            this.setDiscount(0.002);
            this.setCashback(5000);
            this.setPoint(5);
        }
    
    // Method

        // Method untuk menampilkan data member, data peminjaman, serta rinica biaya
        void tampilData() {
            System.out.println(
                "ID Member : " + this.getID() + "\n" +
                "Nama Member : " + this.getNama() + "\n" +
                "Jenis Member : " + this.getJenis() + "\n" +
                "Tanggal Pinjam : " + this.getTglPinjam().getDayOfMonth() + "-" + this.getTglPinjam().getMonthValue() + "-" + this.getTglPinjam().getYear() +  "\n" +
                "Tanggal Kembali : " + this.getTglKembali().getDayOfMonth() + "-" + this.getTglKembali().getMonthValue() + "-" + this.getTglKembali().getYear() +  "\n" +
                "Lama Sewa : " + this.lamaSewa() + " Hari \n\n" +
                "Total Sewa : Rp. " + this.totalSewa() + "\n" +
                "Jumlah Point : " + this.totalPoint() + "\n" +
                "Jumlah Cashback Rp. : " + this.cashback + "\n"
            );
        }

    
}
