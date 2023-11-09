// Membuat objek Konstruktor dari dua class yang berbeda masing masing 2 objek
// membuat class dan method
package JobsheetModul1;

class MobilBalap5 {
    String namaRider;
    String jenisBalap;
    String Negara;
    int Umur;
    int jmlGelar;

    public MobilBalap5(String Nm, String BB, int Jb, int um, String ne) {
        namaRider = Nm;
        jenisBalap = BB;
        jmlGelar = Jb;
        Umur = um;
        Negara = ne;
    }

    public void display() {
        System.out.println("");
        System.out.println("Pembalap          : " + namaRider);
        System.out.println("Usia              : " + Umur);
        System.out.println("Main pada ajang   : " + jenisBalap);
        System.out.println("Negara asal       : " + Negara);
        System.out.println("Jumlah gelar      : " + jmlGelar);
        System.out.println();
    }
}

class MobilUmum {
    String Nama;
    String BahanBakar;
    String JumlahPenumpang;

    public MobilUmum(String Nm, String BB, String Jb) {
        Nama = Nm;
        BahanBakar = BB;
        JumlahPenumpang = Jb;
    }

    public void display() {
        System.out.println();
        System.out.println();
        System.out.println("Nama Mobil               : " + Nama);
        System.out.println("Kapasiatas Penumpang     : " + JumlahPenumpang);
        System.out.println("Bahan Bakar Mobil        : " + BahanBakar);
        System.out.println("");
        System.out.println("");
    }
}

public class P1nomor5_F1B020065 {
    public static void main(String[] args) {
        MobilBalap5 a = new MobilBalap5("andi", "mercedes", 1, 21, "Indonesia");
        a.display();

        MobilUmum b = new MobilUmum("honda", "pertalite", "6 orang");
        b.display();
    }
}
