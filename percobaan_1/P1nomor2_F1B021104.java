class Mobil {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;
}

public class P1nomor2_F1B021104 {
   public static void main(String[] args) {

        Mobil newMobil1 = new Mobil();
        Mobil newMobil2 = new Mobil();

        newMobil1.merek = "Subaru";
        newMobil1.model = "SUV";
        newMobil1.warna = "White";
        newMobil1.bahanBakar = "Diesel";
        newMobil1.harga = 450000000;

        newMobil2.merek = "Mits";
        newMobil2.model = "Trek";
        newMobil2.warna = "Yellow";
        newMobil2.bahanBakar = "Diesel";
        newMobil2.harga = 450000000;

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