
// membuat program inputan dinamis menggunakan studi kasus masing masing dengan 5 buah objek yang berbeda

package JobsheetModul1;

import java.util.Scanner;

class MobilBalap4 {
    String namaRider;
    String jenisBalap;
    String Negara;
    int Umur;
    int jmlGelar;

    public void setMobilBalap4() {

        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Masukkan Nama Rider                : ");
        namaRider = input.nextLine();

        System.out.print("Masukkan Jenis Balapan             : ");
        jenisBalap = input.nextLine();

        System.out.print("Masukkan Umur                      : ");
        Umur = input.nextInt();

        System.out.print("Masukkan Negara                    : ");
        Negara = input.nextLine();

        System.out.print("Masukkan Jumlah Gelar Rider        : ");
        jmlGelar = input.nextInt();
        System.out.println("");
        System.out.println("");

    }

    public void display() {
        System.out.println("---------------------------------");
        System.out.println("Pembalap          : " + namaRider);
        System.out.println("Usia              : " + Umur);
        System.out.println("Main pada ajang   : " + jenisBalap);
        System.out.println("Negara asal       : " + Negara);
        System.out.println("Jumlah gelar      : " + jmlGelar);
        System.out.println();
    }
}

public class P1nomor4_F1B020065 {

    public static void main(String[] args) {

        MobilBalap4 balap1 = new MobilBalap4();
        balap1.setMobilBalap4();
        balap1.display();

        MobilBalap4 balap2 = new MobilBalap4();
        balap2.setMobilBalap4();
        balap2.display();

        MobilBalap4 balap3 = new MobilBalap4();
        balap3.setMobilBalap4();
        balap3.display();

        MobilBalap4 balap4 = new MobilBalap4();
        balap4.setMobilBalap4();
        balap4.display();

        MobilBalap4 balap5 = new MobilBalap4();
        balap5.setMobilBalap4();
        balap5.display();

    }
}
