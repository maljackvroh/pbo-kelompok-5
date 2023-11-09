package percobaan1;

import java.util.Scanner;


class Mobil {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;
    int speedd;

    public void display(String merek, String model, String warna, String bahanBakar, int harga){
        
        System.out.println("\nData Mobil 1:");
        System.out.println("Merek\t\t: "+merek);
        System.out.println("Model\t\t: "+model);
        System.out.println("Warna\t\t: "+warna);
        System.out.println("Bahan Bakar\t: "+bahanBakar);
        System.out.println("harga\t\t: "+harga);
    }

    public void speed(int speedd){
        System.out.println("Max speed is: " +speedd);
    }
}

public class Percobaan1 {
    public static void main(String[] args) {
        Mobil newMobil = new Mobil();
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