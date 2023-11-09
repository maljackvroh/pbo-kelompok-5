/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DINI AYUASTINA
 */
import java.util.Scanner;

public class KalkulatorPersentasesaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        double nilaiAwal = scanner.nextDouble();
        System.out.print("Masukkan persentase: ");
        double nilaiPersentase = scanner.nextDouble();
        double hasil = HitungPersentase(nilaiAwal, nilaiPersentase);
        System.out.println("Hasil: " + hasil + "%");
        
        scanner.close();
    }

    public static double HitungPersentase(double nilaiAwal, double persentase) {
        return (nilaiAwal * persentase) / 100;
    }
}

