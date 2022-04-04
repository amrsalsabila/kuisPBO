/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kriteria;
import perhitungan.hitungNilai;
/**
 *
 * @author Amara Salsabila
 */
public class Programmer extends inputNilai implements hitungNilai {

    public Programmer(String nama, double tesA, double tesB, double tesC) {
        super(nama, tesA, tesB, tesC);
    }
    
    public void inputA(double tesA) {
        this.tesA = tesA;
    }

    public void inputB(double tesB) {
        this.tesB = tesB;
    }

    public void inputC(double tesC) {
        this.tesC = tesC;
    }
     
    @Override
    public double hitungNilaiTotal() {
       return (0.6 * super.tesA) + (0.15 * super.tesB) + (0.25 * super.tesC);
    }
    
    @Override
    public String keterangan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Programmer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Programmer\n";
    }
    
}
