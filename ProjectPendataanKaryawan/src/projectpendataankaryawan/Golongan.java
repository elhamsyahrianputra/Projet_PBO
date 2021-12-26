/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

/**
 *
 * @author Asus
 */
public abstract class Golongan {
    
    public abstract long getGajiPokok();
    
    long tunjangan() {
        long data = this.getGajiPokok() * 10 / 100;
        return data;
    }
    
    long tunjanganPegawai() {
        long data = this.getGajiPokok() * 15 / 100;
        return data;
    }
    
    long tunjanganAnak() {
        long data = (this.getGajiPokok() * 5 / 100);
        return data;
    }
    
    long gajiKotor() {
        long data = this.getGajiPokok() + this.tunjangan() + this.tunjanganAnak() + this.tunjanganPegawai();
        return data;
    }
    
    double potongan() {
        double data = this.gajiKotor() * 2.5 / 100;
        return data;
    }
    
    double gajiBersih() {
        double data = this.gajiKotor() - this.potongan();
        return data;
    }
}
