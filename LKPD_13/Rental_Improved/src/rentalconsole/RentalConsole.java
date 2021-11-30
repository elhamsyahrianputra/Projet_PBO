/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;
    
import java.util.Scanner;
import java.time.LocalDate;



/**
 *
 * @author Asus
 */

public class RentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Instatitation
        Scanner input = new Scanner(System.in);
        DataMember member = new DataMember();
        
        
        member.tambahMember(new Member("M001", "Mr. X", "Silver"));
        member.tambahMember(new Member("M002", "Mr. Y", "Gold"));
        member.tambahMember(new Member("M003", "Mr. Z", "Platinum"));
        
        System.out.print("Masukkan ID Member \t : ");
        String id = input.nextLine();
        String jenis = member.cariJenisMember(id);
        
        
        System.out.print("Masukkan Tangggal Pinjam \t : ");
        int dayPinjam = input.nextInt();
                
        System.out.print("Masukkan Bulan Pinjam \t\t : ");
        int monthPinjam = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam \t\t : ");
        int yearPinjam = input.nextInt();
        
        System.out.print("Masukkan Tanggal Kembali \t : ");
        int dayKembali = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali \t\t : ");
        int monthKembali = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali \t\t : ");
        int yearKembali = input.nextInt();
        
        System.out.println("----------------------------------------------------");
        
        LocalDate pinjam = LocalDate.of(yearPinjam, monthPinjam, dayPinjam);
        LocalDate kembali = LocalDate.of(yearKembali, monthKembali, dayKembali);
        String nama = member.cariNamaMember(id);
        

        switch(jenis) {
            
            case "Silver" :
            Silver silver = new Silver(id, nama, jenis, pinjam, kembali);
            silver.tampilData();
            break;
            
            case "Gold" : 
            Gold gold = new Gold(id, nama, jenis, pinjam, kembali);
            gold.tampilData();
            break;
            
            case "Platinum" :
            Platinum platinum = new Platinum(id, nama, jenis, pinjam, kembali);
            platinum.tampilData();
            break;
        }
        
        
        
    }
    
}
