import java.util.Scanner;

class Mobil2 {
    public String[][] data = {
            { "Honda", "Avanza", "150000000" },
            { "Toyota", "Kijang", "250000000" },
            { "Mitsubishi", "Xpander", "280000000" }};
    int mobil;
    int harga;
    int jumlah;
    int total;

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

    public void kasir() {
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
        Scanner input = new Scanner(System.in);

        a.display();
        a.daftar();

        System.out.print("\nMasukkan nomor mobil yang ingin dibeli: ");
        a.mobil = input.nextInt() - 1;
        while (a.mobil < 0 || a.mobil >= 3) {
            System.out.print("Nomor mobil tidak valid, silakan masukkan nomor yang valid: ");

        }

        System.out.print("Masukkan jumlah mobil yang ingin dibeli: ");
        a.jumlah = input.nextInt();
        System.out.println("");
        a.harga = Integer.parseInt(a.data[a.mobil][2]);
        a.total = a.harga * a.jumlah;
        
        a.kasir();

    }
}
