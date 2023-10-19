/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author DINI AYUASTINA
 */
  import java.util.Scanner;


class Mobilll{
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

public class P1nomor4_F1B021114 {
    public static void main(String[] args) {
        Mobilll newMobilll = new Mobilll();
        Scanner obj = new Scanner(System.in);

        System.out.println("Masukan data Mobil: ");
        newMobilll.merek = obj.nextLine();
        newMobilll.model = obj.nextLine();
        newMobilll.warna = obj.nextLine();
        newMobilll.bahanBakar = obj.nextLine();
        newMobilll.harga = obj.nextInt();
        newMobilll.speedd = obj.nextInt();

        System.out.println("\nBerikut data mobil yang anda masukan: ");
        System.out.println("Merek"+newMobilll.merek);
        System.out.println("Model: "+newMobilll.model);
        System.out.println("Warna: "+newMobilll.warna);
        System.out.println("Bahan bakar: "+newMobilll.bahanBakar);
        System.out.println("harga: "+newMobilll.harga);
        System.out.println("speed: "+newMobilll.speedd);


        // newMobil.speed(newMobil.speedd);
    }
}  