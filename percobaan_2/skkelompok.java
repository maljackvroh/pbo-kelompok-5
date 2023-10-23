package percobaan_2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String kelompok;
    String kbk;
    String alamat;

    void display1 () {
        System.out.println("\nNama\t: "+nama);
    }

    void display2(){
        System.out.println("NIM\t: "+nim);
    }

    void display3(){
        System.out.println("kelompok\t: "+kelompok);
    }

    void display4(){
        System.out.println("\tKBK: "+kbk);
    }

    void display5(){
        System.out.println("alamat\t: "+alamat);
    }
}

public class skkelompok {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Scanner in = new Scanner(System.in);

        System.out.println("Masukan data mahasiswa: ");
        
        System.out.println("Nama: ");
        mhs.nama = in.nextLine();
        
        System.out.println("NIM: ");
        mhs.nim = in.nextLine();

        System.out.println("Kelompok: ");
        mhs.kelompok = in.nextLine();

        System.out.println("Masukan KBK: ");
        mhs.kbk = in.nextLine();

        System.out.println("Alamat: ");
        mhs.alamat = in.nextLine();

        mhs.display1();
        mhs.display2();
        mhs.display3();
        mhs.display4();
        mhs.display5();
    }
}
