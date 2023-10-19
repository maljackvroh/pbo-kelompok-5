import java.util.Scanner;

public class P1nomor5_F1B021104 {

    public P1nomor5_F1B021104() {
        String merek;
        String model;
        String warna;
        String bahanBakar;
        int harga;
        int speedd;

    }

    public static void main(String[] args) {
        P1nomor5_F1B021104 newMobil = new P1nomor5_F1B021104();
        Scanner obj = new Scanner(System.in);

        System.out.println("Masukan data Mobil: ");
        newMobil.merek = obj.nextLine();
        newMobil.model = obj.nextLine();
        newMobil.warna = obj.nextLine();
        newMobil.bahanBakar = obj.nextLine();
        newMobil.harga = obj.nextInt();
        newMobil.speedd = obj.nextInt();

        System.out.println("\nBerikut data mobil yang anda masukan: ");
        System.out.println("Merek"+newMobil.merek);
        System.out.println("Model: "+newMobil.model);
        System.out.println("Warna: "+newMobil.warna);
        System.out.println("Bahan bakar: "+newMobil.bahanBakar);
        System.out.println("harga: "+newMobil.harga);
        System.out.println("speed: "+newMobil.speedd);


        newMobil.speed(newMobil.speedd);
    }
}