/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

/**
 *
 * @author Asus
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayProcessing r = new ArrayProcessing();
       
       r.input();
       r.output();
       System.out.println("Nilai Max: " + r.cariMax());
       System.out.println("Nilai Min: " + r.cariMin());
       r.urutkan();
       
    }
    
}
