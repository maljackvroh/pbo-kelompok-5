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
class Mobill {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

    public void display(String merek, String model, String warna, String bahanBakar, int harga){
        
        System.out.println("\nData Mobil 1:");
        System.out.println("Merek\t\t: "+merek);
        System.out.println("Model\t\t: "+model);
        System.out.println("Warna\t\t: "+warna);
        System.out.println("Bahan Bakar\t: "+bahanBakar);
        System.out.println("harga\t\t: "+harga);
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: " +maxSpeed);
    }
}

public class P1nomor3_F1B021114 {
    public static void main(String[] args) {
        Mobill newMobill = new Mobill();

        newMobill.display("Honda Civic", "Civic LX", "Cosmic Blue Metallic", "Bensin", 700000000);
        newMobill.speed(900);
    }
}
