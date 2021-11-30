/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */

public class DataMember {


    ArrayList<Member> dataMember = new ArrayList<Member>();
     

    void tambahMember(Member data){
        this.dataMember.add(data);
    }
    
    String cariJenisMember(String id){
        boolean stat = false;
        int index = -1;
        for(int i=0; i<this.dataMember.size(); i++){
           if (this.dataMember.get(i).idMember.equals(id)){
              index = i;
              stat = true;
           }
        }
    if (stat == true){
       return this.dataMember.get(index).jenisMember;
    } else {

       System.out.println("Maaf data member tidak ditemukan");
       System.exit(0);
       return null;
       
    }
}
    
    String cariNamaMember(String id){

        boolean stat = false;
        int index = -1;
        for(int i=0; i<this.dataMember.size(); i++){
           if (this.dataMember.get(i).idMember.equals(id)){
              index = i;
              stat = true;
           }
        }
        if (stat == true){
           return this.dataMember.get(index).namaMember;
        } else {
            return null;
        }
    }
    
}
