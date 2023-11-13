package percobaan_4;

import java.util.Scanner;

class calc{
    // tambah
    int calc(int a, int b){
        return a+b;
    }

    // kali
    double calc(double c, double d){
        return c*d;
    }

    // bagi
    float calc(float e, float f){
        return e / f;
    }

    public void hasil(int x, int y){
        System.out.println("Hasil dari "+x+" + "+y+" = "+calc(x, y));
    }

    public void hasil(double x, double y){
        System.out.println("Hasil dari "+x+" x "+y+" = "+calc(x, y));
    }

    public void hasil(float x, float y){
        System.out.println("Hasil dari "+x+" / "+y+" = "+calc(x, y));
    }
}

public class responacc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calc tambh = new calc();

        System.out.println("PROGRAM KALKULATOR SEDERHANA sekali");
        System.out.println("===================================");
        System.out.print("Masukan bilangan 1: ");
        int tA = in.nextInt();
        System.out.print("Masukan bilangan 2: ");
        int tB = in.nextInt();
        tambh.hasil(tA, tB);
        
        System.out.print("\nMasukan bilangan 1: ");
        double kA = in.nextDouble();
        System.out.print("Masukan bilangan 2: ");
        double kB = in.nextDouble();
        tambh.hasil(kA, kB);

        System.out.print("\nMasukan bilangan 1: ");
        float bA = in.nextFloat();
        System.out.print("Masukan bilangan 2: ");
        float bB = in.nextFloat();
        tambh.hasil(bA, bB);
    }
}
