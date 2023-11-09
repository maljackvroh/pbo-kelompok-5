import java.util.Scanner;

class kalkulator {
    double Berat;
    double Tinggi;
    double hasil;

    public void set() {
        Scanner input = new Scanner(System.in);
        System.out.print("Berat Badan (kg)  : ");
        Berat = input.nextDouble();
        System.out.print("Tinggi Badan (cm) : ");
        Tinggi = input.nextDouble() / 100.0;
        hasil = Berat / (Tinggi * Tinggi);
        System.out.println("");
        System.out.println("====================");
        System.out.println("Indeks Massa Tubuh = " + hasil);
        System.out.println("    ");
        if (hasil <= 18.5) {
            System.out.println("Anda kekurangan berat badan");
        } else if (hasil <= 25) {
            System.out.println("Berat badan anda Normal");
        } else if (hasil <= 27) {
            System.out.println("Anda Mengalami Obesitas");
        } else {
            System.out.println("Anda Mengalami Obesitas Parah");
        }
        System.out.println("=====================");
    }

}

public class KalkulatorBMI {
    public static void main(String[] args) {
        kalkulator a = new kalkulator();
        a.set();
    }
}
