

class Mobil{
    String nama;
    String mesin;
    String bahanBakar;
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
        ionic.roda = 4;
        ionic.kapasitas = 5;

        fuso.nama = "Mitsubishi Fuso";
        fuso.bahanBakar = "Diesel";
        fuso.roda = 8;
        fuso.kapasitas = 1290;


        System.out.println("Nama Mobil 1: "+ ionic.nama);
    }
}