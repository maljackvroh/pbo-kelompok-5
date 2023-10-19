class Mobill{
    String nama;
    String bahanBakar;
    String warna;
    int roda;
    int kapasitas;


}

public class Js2 {
    public static void main(String[] args) {
        Mobill ionic = new Mobill();
        Mobill fuso = new Mobill();

        ionic.nama = "Hyundai Ionic 5";
        ionic.bahanBakar = "Listrik";
        ionic.warna = "Abu - abu";
        ionic.roda = 4;
        ionic.kapasitas = 5;

        fuso.nama = "Mitsubishi Fuso";
        fuso.bahanBakar = "Diesel";
        fuso.warna = "Kuning";
        fuso.roda = 8;
        fuso.kapasitas = 1290;

        System.out.println("\nNama Mobill 1: "+ ionic.nama);
        System.out.println("Bahan Bakar  = " + ionic.bahanBakar);
        System.out.println("Banyak roda = " + ionic.roda);
        System.out.println("Kapasitas = " + ionic.kapasitas + "Orang\n");

        System.out.println("Nama Mobill 2: "+ fuso.nama);
        System.out.println("Bahan Bakar  = " + fuso.bahanBakar);
        System.out.println("Banyak roda = " + fuso.roda);
        System.out.println("Kapasitas = " + fuso.kapasitas + " Kg\n");
    }
}