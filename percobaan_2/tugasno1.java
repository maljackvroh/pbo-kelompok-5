/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author DINI AYUASTINA
 */

import java.util.Scanner;

import percobaan_2.akmal_dzaki.Mahasiswa;

class Mahasiswaaa{
    String nama;
    String nim;
    int kelompok;
    String kbk;
    String alamat;

    void display1 () {
        System.out.println("\nNama\t: "+nama);
    }

    void display2 () {
        System.out.println("NIM\t: "+nim);
    }

    void display3 () {
        System.out.println("Kelompok\t: "+kelompok);
    }

    void display4 () {
        System.out.println("KBK\t: "+kbk);
    }

    void display5 () {
        System.out.println("Alamat\t: "+alamat);
    }
}

public class tugasno1{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("Masukkan Nama: ");
        mhs.nama = obj.next();
        System.out.println("Masukkan NIM: ");
        mhs.nim = obj.next();
        System.out.println("Masukkan Kelompok: ");
        mhs.kelompok = obj.nextInt();
        System.out.println("Masukkan KBK: ");
        mhs.kbk = obj.next();
        System.out.println("Masukkan Alamat: ");
        mhs.alamat = obj.next();
        
        System.out.println("===========================");
        System.out.println("BIODATA MAHASISWA: ");
        
        mhs.display1();  
        mhs.display2();
        mhs.display3();
        mhs.display4();
        mhs.display5();
        
        System.out.println("===========================");
    }

}
    
