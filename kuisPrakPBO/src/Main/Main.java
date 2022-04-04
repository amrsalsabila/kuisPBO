/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
import Kriteria.Designer;
import Kriteria.Manager;
import Kriteria.Programmer;
import Kriteria.inputNilai;


/**
 *
 * @author Amara Salsabila
 */

public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Pelamaran Lowongan Pekerjaan");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilih = input.nextInt();
        
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Input Nama :\n");
        String nama = data.next();
        
        System.out.println("---Penilaian---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
        
        if (pilih == 1){
            
            System.out.print("Input Nilai Programming Knowledge : ");
            double tesA = data.nextDouble();
            System.out.print("Input Nilai Clean Coding : ");
            double tesB = data.nextDouble();
            System.out.print("Input Nilai Debugging : ");
            double tesC = data.nextDouble();
            Programmer prog = new Programmer(nama,tesA,tesB,tesC);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                if (pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + prog.hitungNilaiTotal());
                    System.out.println("Keterangan : " + prog.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Programming Knowledge : ");
                    prog.inputA(input.nextDouble());
                    System.out.print("Input Nilai Clean Coding : ");
                    prog.inputB(input.nextDouble());
                    System.out.print("Input Nilai Debugging : ");
                    prog.inputC(input.nextDouble());
                    
                }
                else {
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.print("Input Nilai Design Portofolio : ");
            double tesA = data.nextDouble();
            System.out.print("Input Nilai Prototyping : ");
            double tesB = data.nextDouble();
            System.out.print("Input Nilai Creativity : ");
            double tesC = data.nextDouble();
            Designer des = new Designer(nama, tesA, tesB, tesC);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + des.hitungNilaiTotal());
                    System.out.println("Keterangan : " + des.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Design Portofolio : ");
                    des.inputA(input.nextInt());
                    System.out.print("Input Nilai Prototyping : ");
                    des.inputB(input.nextInt());
                    System.out.print("Input Nilai Creativity : ");
                    des.inputC(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else if(pilih == 3){
            System.out.print("Input Nilai Innovation : ");
            double tesA = data.nextDouble();
            System.out.print("Input Nilai Decision Making : ");
            double tesB = data.nextDouble();
            System.out.print("Input Nilai Communication: ");
            double tesC = data.nextDouble();
            Manager manag = new Manager(nama, tesA, tesB, tesC);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + manag.hitungNilaiTotal());
                    System.out.println("Keterangan : " + manag.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Innovation : ");
                    manag.inputA(input.nextInt());
                    System.out.print("Input Nilai Decision Making  : ");
                    manag.inputB(input.nextInt());
                    System.out.print("Input Nilai Communication: ");
                    manag.inputC(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
    }
    
}
