package percobaan_2;
import java.util.Scanner;

class Bangun {
    int sisi;
    int tinggi;
    int hasil;

    // Rumus volume limas V: ⅓ x (s x s) x t
    double hitung(){
        return hasil = (sisi*sisi)*tinggi/3;
    }
}

public class js5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Bangun limas = new Bangun();

        System.out.println("Mencari nilai volume limas");
        System.out.println("==========================");
        System.out.println("Masukan nilai sisi: ");
        limas.sisi = obj.nextInt();
        System.out.println("Masukan nilai tinggi: ");
        limas.tinggi = obj.nextInt();

        System.out.println("Volume dari limas segi empat dengan sisi "+limas.sisi+" dan volume "+limas.tinggi+" adalah "+limas.hitung());
    }
}
