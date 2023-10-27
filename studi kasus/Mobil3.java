import java.util.Scanner;

class Mobil2 {
    String[][] data = {
            { "Honda", "Avanza", "150000000" },
            { "Toyota", "Kijang", "250000000" },
            { "Mitsubishi", "Xpander", "280000000" }
    };

    public void display() {
        System.out.println("SELAMAT DATANG DI TOKO MOBIL JAYA");
        System.out.println("==================================");
    }

    public void daftar() {
        System.out.println("\nDaftar mobil:");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + ". " + data[i][0] + " " + data[i][1] + " - Rp " + data[i][2]);
        }
    }

    public void pilih() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nomor mobil yang ingin dibeli: ");
        int mobil = input.nextInt() - 1;
        while (mobil < 0 || mobil >= data.length) {
            System.out.print("Nomor mobil tidak valid, silakan masukkan nomor yang valid: ");

        }

        System.out.print("Masukkan jumlah mobil yang ingin dibeli: ");
        int jumlah = input.nextInt();
        System.out.println("");
        int harga = Integer.parseInt(data[mobil][2]);
        int total = harga * jumlah;
        if (total >= 500000000) {
            int diskon = total / 9;
            total -= diskon;
            System.out.println("SELAMAT !!!, Anda mendapatkan diskon 9%!");
            System.out.println("Diskon: Rp " + diskon);
        }

        System.out.println("\nDetail Pembelian:");
        System.out.println("---------------------");
        System.out.println("Merk    : " + data[mobil][0]);
        System.out.println("Model   : " + data[mobil][1]);
        System.out.println("Harga   : Rp " + harga);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Total   : Rp " + total);
        System.out.println("---------------------");
    }

}

public class Mobil3 {
    public static void main(String[] args) {
        Mobil2 a = new Mobil2();
        a.display();
        a.daftar();
        a.pilih();

    }
}
