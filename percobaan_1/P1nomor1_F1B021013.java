package percobaan1;
 class Mobil {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

}

public class Percobaan1 {
    public static void main(String[] args) {
        Mobil newMobil = new Mobil();

        newMobil.merek = "Subaru";
        newMobil.model = "SUV";
        newMobil.warna = "White";
        newMobil.bahanBakar = "Diesel";
        newMobil.harga = 450000000;


        System.out.println("\nData Mobil:");
        System.out.println("Merek\t\t: "+newMobil.merek);
        System.out.println("Model\t\t: "+newMobil.model);
        System.out.println("Warna\t\t: "+newMobil.warna);
        System.out.println("Bahan Bakar\t: "+newMobil.bahanBakar);
        System.out.println("harga\t\t: "+newMobil.harga);

    }
    
}