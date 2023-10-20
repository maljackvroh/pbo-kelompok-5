package percobaan_2;

class Mahasiswa {
    String nama;
    String nim;
    int kelompok;
    String alamat;

    void display1 () {
        System.out.println("\nNama\t: "+nama);
    }

    void display2(){
        System.out.println("NIM\t: "+nim);
    }

    void display3(){
        System.out.println("NIM\t: "+nim);
    }

    void display4(){
        System.out.println("NIM\t: "+nim);
    }

    void display5(){
        System.out.println("NIM\t: "+nim);
    }
}

public class skkelompok {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Akmal Dzaki";
        mhs.nim = "F1B021104";

        mhs.display1();
        mhs.display2();
    }
}
