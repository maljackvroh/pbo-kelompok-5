package percobaan_2.akmal_dzaki;

class Mahasiswa {
    String nama;
    String nim;

    void display1 () {
        System.out.println("\nNama\t: "+nama);
    }

    void display2(){
        System.out.println("NIM\t: "+nim);
    }
}

public class js1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Akmal Dzaki";
        mhs.nim = "F1B021104";

        mhs.display1();
        mhs.display2();
    }
}
