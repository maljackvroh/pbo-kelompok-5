package percobaan1;
 class mobil{
     String merek;
     String model;
     String warna;
     String bahanbakar;
     int harga;
 }
public class Percobaan1 {

    
    public static void main(String[] args) {
        mobil mobil1 = new mobil();
        mobil1.merek = "Toyota";
        mobil1.model = "Corolla";
        mobil1.warna = "Hijau";
        mobil1.bahanbakar = "Pertamax";
        mobil1.harga = 100000000;
        
        System.out.println(mobil1.merek);
        System.out.println(mobil1.model);
        System.out.println(mobil1.warna);
        System.out.println(mobil1.bahanbakar);
        System.out.println(mobil1.harga);
        
        System.out.println("==========");
        
         mobil mobil2 = new mobil();
        mobil1.merek = "Honda";
        mobil1.model = "Civic";
        mobil1.warna = "Merah";
        mobil1.bahanbakar = "Pertamax";
        mobil1.harga = 110000000;
        
        System.out.println(mobil1.merek);
        System.out.println(mobil1.model);
        System.out.println(mobil1.warna);
        System.out.println(mobil1.bahanbakar);
        System.out.println(mobil1.harga);
    }
    
}
