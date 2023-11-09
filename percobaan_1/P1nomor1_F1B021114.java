/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author DINI AYUASTINA
 * 
 * 
 */

class Mobil1{
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;
}

public class P1nomor1_F1B021114 {
    public static void main(String[] args) {
        Mobil1 newMobil = new Mobil1();

        newMobil.merek = "Toyota Camry";
        newMobil.model = "Camry XLE";
        newMobil.warna = "Midnight Black Metallic";
        newMobil.bahanBakar = "Bensin";
        newMobil.harga = 800000000;


        System.out.println("\nData Mobil:");
        System.out.println("Merek\t\t: "+newMobil.merek);
        System.out.println("Model\t\t: "+newMobil.model);
        System.out.println("Warna\t\t: "+newMobil.warna);
        System.out.println("Bahan Bakar\t: "+newMobil.bahanBakar);
        System.out.println("harga\t\t: "+newMobil.harga);

    }

}
