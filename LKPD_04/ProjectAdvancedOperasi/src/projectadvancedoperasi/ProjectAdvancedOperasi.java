/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Asus
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operasi o = new Operasi();
        
        double Operasi1 = o.jumlahkan(123, 565);
        System.out.println(Operasi1);
        
        double Operasi2 = o.jumlahkan(1.23, 12.3);
        System.out.println(Operasi2);
        
        double Operasi3 = o.kalikan(0.123, 12.3);
        System.out.println(Operasi3);
        
        double Operasi4 = o.kalikan(123, 12.3, 54.7);
        System.out.println(Operasi4);
        
        double Operasi5 = o.kalikan(45.6, 45.6, 125);
        System.out.println(Operasi5);
        
        double Operasi6 = o.kalikan(0.123, 12.3, 123.4);
        System.out.println(Operasi6);
        
    }
    
}
