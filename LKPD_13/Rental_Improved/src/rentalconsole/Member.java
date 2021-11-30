/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Asus
 */
public class Member {
    
    // Attribute
        String idMember;
        String namaMember;
        String jenisMember;
 
    // Constructor
    Member(String id, String nama, String jenis){
        this.idMember = id;
        this.namaMember = nama;
        this.jenisMember = jenis;
    }
    
    void print(){
        System.out.println("Kode Barang: " + this.idMember);
        System.out.println("Nama Barang: " + this.namaMember);
        System.out.println("Harga      : " + this.jenisMember);
     
    // Method
    }
    
}
