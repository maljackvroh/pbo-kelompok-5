import java.util.Scanner;


class Cars {
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

public class P1skkelompok {
    public static void main(String[] args) {
        Cars newCars = new Cars();
        Scanner obj = new Scanner(System.in);

        System.out.println("Masukan data Mobil");
        System.out.println("Merek: ");
        newCars.merek = obj.nextLine();
        System.out.println("Model: ");
        newCars.model = obj.nextLine();
        System.out.println("Warna: ");
        newCars.warna = obj.nextLine();
        System.out.println("Bahan Bakar: ");
        newCars.bahanBakar = obj.nextLine();
        System.out.println("Harga(nominal saja): ");
        newCars.harga = obj.nextInt();
        System.out.println("Max Speed: ");
        newCars.speedd = obj.nextInt();

        newCars.display(newCars.merek, newCars.model, newCars.warna, newCars.bahanBakar, newCars.harga);


        newCars.speed(newCars.speedd);
    }
}