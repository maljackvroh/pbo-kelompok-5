package percobaan_2;

class Mahasiswa {
    String nama;
    String nim;
    int kelompok;
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

        mhs.nama = "Akmal Dzaki";
        mhs.nim = "F1B021104";
        mhs.kelompok = 5;
        mhs.kbk = "Teknik Komputer";
        mhs.alamat = "Jln Melur No1.A";

        mhs.display1();
        mhs.display2();
        mhs.display3();
        mhs.display4();
        mhs.display5();
    }
}
