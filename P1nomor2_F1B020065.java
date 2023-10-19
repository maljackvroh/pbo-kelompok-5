// membuat 5 atribut kemudian tampilkan dalam 2 objek yang berbeda 
package JobsheetModul1;

class MobilBalap2 {
    String namaRider;
    String jenisBalap;
    String Negara;
    int Umur;
    int jmlGelar;

    public MobilBalap2(String Nm, String BB, int Jb, int um, String ne) {
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

public class P1nomor2_F1B020065 {
    public static void main(String[] args) {
        MobilBalap2 balap1 = new MobilBalap2("adi", "f1", 9, 24, "meksiko");

        MobilBalap2 balap2 = new MobilBalap2("surya", "offroad", 8, 30, "Nigeria");

        balap1.display();
        balap2.display();
    }
}
