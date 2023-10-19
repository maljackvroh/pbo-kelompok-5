/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author DINI AYUASTINA
 */
    
class Mobil {
    String merek;
    String model;
    String warna;
    String bahanbakar;
    int harga;

    public void display(){
        System.out.println("merek      : " + merek);
        System.out.println("model      : " + model);
        System.out.println("warna      : " + warna);
        System.out.println("bahanbakar : " + bahanbakar);
        System.out.println("harga      : " + harga);
    }
}

public class dini {
    
    public static void main(String[] args){
      Mobil mobilsaya = new Mobil();

      mobilsaya.merek = "Hyundai";
      mobilsaya.model = "Sonata";
      mobilsaya.warna = "Grey";
      mobilsaya.bahanbakar = "Diesel";
      mobilsaya.harga = 1000000000;

      mobilsaya.display();
    }
}