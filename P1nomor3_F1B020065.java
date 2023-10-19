// membuat class dan method
package JobsheetModul1;

class MobilBalap3 {
    String namaRider;
    String jenisBalap;
    String Negara;
    int Umur;
    int jmlGelar;

    public MobilBalap3(String Nm, String BB, int Jb, int um, String ne) {
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

public class P1nomor3_F1B020065 {
    public static void main(String[] args) {
        MobilBalap3 balap1 = new MobilBalap3("Budi", "Naskar", 9, 41, "Russia");

        MobilBalap3 balap2 = new MobilBalap3("Hendra", "f1", 8, 23, "Brazil");
        balap1.display();
        balap2.display();
    }
}
