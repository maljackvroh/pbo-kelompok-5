// Membuat atribut dari sebuah class dan buatkan objek
package JobsheetModul1;

class MobilBalap1 {
    String namaRider;
    String jenisBalap;
    int Umur;

}

public class P1nomor1_F1B020065 {
    public static void main(String[] args) {
        MobilBalap1 a = new MobilBalap1();
        a.namaRider = "Budi";
        a.Umur = 45;
        a.jenisBalap = "Balap F1";

        System.out.println("Pembalap          : " + a.namaRider);
        System.out.println("Usia              : " + a.Umur);
        System.out.println("Main pada ajang   : " + a.jenisBalap);
    }
}
