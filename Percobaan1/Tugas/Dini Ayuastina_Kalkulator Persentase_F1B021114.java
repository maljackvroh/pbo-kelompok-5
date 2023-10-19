import java.util.Scanner;

public class KalkulatorPersentase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        double nilaiAwal = scanner.nextDouble();

        System.out.print("Masukkan persentase: ");
        double persentase = scanner.nextDouble();

        double hasil = hitungPersentase(nilaiAwal, persentase);

        System.out.println("Hasil: " + hasil + "%");

        scanner.close();
    }

    public static double hitungPersentase(double nilaiAwal, double persentase) {
        return (nilaiAwal * persentase) / 100;
    }
}