package percobaan_2;
import java.util.Scanner;

class Bangun {
    int sisi;
    int tinggi;
    int hasil;

    // Rumus volume limas V: ⅓ x (s x s) x t
    double hitung(){
        return hasil = 1/3*(sisi*sisi)*tinggi;
    }
}

public class js3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Bangun limas = new Bangun();

        System.out.println("Mencari nilai volume limas");
        System.out.println("==========================");
        System.out.println("Masukan nilai sisi: ");
        limas.sisi = obj.nextInt();
        System.out.println("Masukan nilai tinggi: ");
        limas.tinggi = obj.nextInt();

        System.out.println("Volume dari limas: "+limas.hitung());
    }
}
