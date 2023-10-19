package praktikum;

class Mobil {
    String Nama, warna, BahanBakar;
    int tahunProduksi;
    String MaxSpeed, mesin;

    public Mobil(String Nama, String warna, String BahanBakar, String MaxSpeed, String mesin, int tahunProduksi) {
        this.Nama = Nama;
        this.warna = warna;
        this.BahanBakar = BahanBakar;
        this.MaxSpeed = MaxSpeed;
        this.tahunProduksi = tahunProduksi;
    }

    public void display() {
        System.out.println("Nama Mobil : " + Nama);
        System.out.println("Warna Mobil : " + warna);
        System.out.println("Bahan Bakar Mobil : " + BahanBakar);
        System.out.println("Tahun produksi Mobil : " + tahunProduksi);
        System.out.println("Maksimum kecepatan Mobil : " + MaxSpeed);
        System.out.println("Mobil menggunakan mesin : " + mesin);
    }

}

public class praktikum {
    public static void main(String[] args) {
        Mobil Honda = new Mobil("Honda Jazz", "Merah", "Pertamax", "100 km/jam", "200 cc", 2012);
        Honda.display();
    }
}
