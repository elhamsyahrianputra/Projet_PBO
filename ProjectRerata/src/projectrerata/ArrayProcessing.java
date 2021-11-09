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

import java.util.Scanner;

public class ArrayProcessing {
    
    // array of integer -> data
    int [] dataBil = new int[100];
    // Jumlah data
    int n;
    int swap;
    
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya dataa (n): ");
        this.n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data) {
        double sum = 0;
        for(int i=0; i<n; i++) {
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    void output() {
        System.out.println("Rerata: " + this.hitungRerata(dataBil));
    }
    
    int cariMax() {
        int max = 0;
        for (int i=0; i<n; i++) {
            if (max < this.dataBil[i]) {
                max = this.dataBil[i];
            } else {
                max = max;
            }
        }
        return max;
    }
    
    int cariMin() {
        int min = 999999;
        for (int i=0; i<n; i++) {
            if (min > this.dataBil[i]) {
                min = this.dataBil[i];
            } else {
                min = min;
            }
        }
        return min;
    }
     
    void urutkan() {
                
        System.out.print("Bilangan Sebelum diurutkan : ");
        for(int i=0; i<n; i++) {
            System.out.print(this.dataBil[i] +" ");
        }

        for(int i=0; i<(n-1); i++) {
            for(int j=0; j<n-i-1; j++) {
                if (this.dataBil[j] > this.dataBil[j+1]) {
                    swap = this.dataBil[j];
                    this.dataBil[j] = this.dataBil[j+1];
                    this.dataBil[j+1] = swap;
                }
            }
        }

        System.out.print("\nBilangan Terurutnya adalah : ");
        for(int i=0; i<n; i++) {
            System.out.print(this.dataBil[i] +" ");
        }
    }
}
