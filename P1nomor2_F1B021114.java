/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author DINI AYUASTINA
**/

class Mobilsaya {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;
}

public class P1nomor2_F1B021114 {
   public static void main(String[] args) {

        Mobilsaya newMobil1 = new Mobilsaya();
        Mobilsaya newMobil2 = new Mobilsaya();

        newMobil1.merek = "Toyota Camry";
        newMobil1.model = "Camry XLE";
        newMobil1.warna = " Midnight Black Metallic";
        newMobil1.bahanBakar = "Bensin";
        newMobil1.harga = 800000000;

        newMobil2.merek = "Honda Civic";
        newMobil2.model = "Civic LX";
        newMobil2.warna = "Cosmic Blue Metallic";
        newMobil2.bahanBakar = "Bensin";
        newMobil2.harga = 700000000;

        System.out.println("\nData Mobil 1:");
        System.out.println("Merek\t\t: "+newMobil1.merek);
        System.out.println("Model\t\t: "+newMobil1.model);
        System.out.println("Warna\t\t: "+newMobil1.warna);
        System.out.println("Bahan Bakar\t: "+newMobil1.bahanBakar);
        System.out.println("harga\t\t: "+newMobil1.harga);

        System.out.println("\nData Mobil 2:");
        System.out.println("Merek\t\t: "+newMobil2.merek);
        System.out.println("Model\t\t: "+newMobil2.model);
        System.out.println("Warna\t\t: "+newMobil2.warna);
        System.out.println("Bahan Bakar\t: "+newMobil2.bahanBakar);
        System.out.println("harga\t\t: "+newMobil2.harga);

   }

}
