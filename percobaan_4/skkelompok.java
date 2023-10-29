package percobaan_4;

import java.util.Scanner;
// Buatlah constructor overload untuk menghitung volume bangun ruang balok, kubus dan limas. Isi nilai tinggi dengan 2 digit nim terakhir anda.

class volume{
    int hasilBalok;
    int hasilKubus;
    int hasilLimas;

    /* Rumus volume balok
     * v =  p * l * t
     */
    volume(int p, int l, int t){
        hasilBalok = p*l*t;
    }

    /* Rumus volume kubus
     * v =  s^3
     */
    volume(int s){
        hasilKubus = s*s*s;
    }

    /* Rumus volume limas
     * v =  l alas * t / 3
     */
    volume(int la, int t){
        hasilLimas = la * t / 3;
    }
}

public class skkelompok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Inputan nilai Balok
        System.out.println("\nMasukan nilai balok");
        System.out.println("P: ");
        int p = in.nextInt();
        System.out.println("L: ");
        int l = in.nextInt();
        System.out.println("T: ");
        int t = in.nextInt();

        //Inputan nilai Kubus
        System.out.println("\nMasukan nilai kubus");
        System.out.println("P: ");
        int s = in.nextInt();
        
        //Inputan nilai Limas
        System.out.println("\nMasukan nilai limas");
        System.out.println("Luas alas: ");
        int la = in.nextInt();
        System.out.println("T: ");
        int ti = in.nextInt();

        volume balok = new volume(p,l,t);
        volume kubus = new volume(s);
        volume limas = new volume(la, ti);

        System.out.println("\nBerdasarkan inputan diatas");
        System.out.println("Balok = "+balok.hasilBalok);
        System.out.println("Kubus = "+kubus.hasilKubus);
        System.out.println("Limas = "+limas.hasilLimas);
    }
}
