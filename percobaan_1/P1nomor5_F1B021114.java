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
class Mobil {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

    public Mobil (String a, String b, String c, String d, int e){
        merek = a;
        model = b;
        warna = c;
        bahanBakar = d;
        harga = e;
    }
    
    public void display() {
        System.out.println(merek);
        System.out.println(model);
        System.out.println(warna);
        System.out.println(bahanBakar);
        System.out.println(harga);
        
    }

}

class Motor {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

    public Motor (String a, String b, String c, String d, int e){
        merek = a;
        model = b;
        warna = c;
        bahanBakar = d;
        harga = e;
    }
    
    public void display() {
        System.out.println(merek);
        System.out.println(model);
        System.out.println(warna);
        System.out.println(bahanBakar);
        System.out.println(harga);
        
        
    }
}

public class P1nomor5_F1B021114{
    public static void main(String[] args) {
        Mobil mobill = new Mobil("Toyota Camry", "Camry XLE", "Midnight Black Metallic", "Bensin", 800000000);
        Motor motorr = new Motor("Scoopy 2023", "Scoopy", "Black", "Bensin", 20000000);

        mobill.display();
        motorr.display();
    }
}
