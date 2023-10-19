class Mobil{
    String nama;
    String bahanBakar;
    String warna;
    int roda;
    int kapasitas;


}

public class Js1 {
    public static void main(String[] args) {
        Mobil ionic = new Mobil();
        Mobil fuso = new Mobil();
        Mobil suv = new Mobil();

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

        suv.nama = "Subaru Forester";
        suv.bahanBakar = "Otomatis";
        suv.warna = "Putih";
        suv.roda = 6;
        suv.kapasitas = 5;


        System.out.println("\nNama Mobil 1: "+ ionic.nama);
        System.out.println("Bahan Bakar Mobil " + ionic.nama + " = " + ionic.bahanBakar);
        System.out.println("Banyak roda Mobil " + ionic.nama + " = " + ionic.roda);
        System.out.println("Kapasitas Mobil "+ ionic.nama + " " + ionic.kapasitas + "Orang");
    }
}