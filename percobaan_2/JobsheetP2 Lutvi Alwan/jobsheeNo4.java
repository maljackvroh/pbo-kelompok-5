public class jobsheeNo4 {
    String nama;
    int umur;
    String hobi;
    String alamat;

    // Konstruktor untuk menginisialisasi data identitas diri
    public jobsheeNo4(String nama, int umur, String alamat, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.hobi = hobi;
    }

    // Method untuk mendapatkan nama
    public String getNama() {
        return nama;
    }

    // Method untuk mendapatkan umur
    public int getUmur() {
        return umur;
    }

    // Method untuk mendapatkan alamat
    public String getAlamat() {
        return alamat;
    }

    // Method untuk mendapatkan hobi
    public String getHobi() {
        return hobi;
    }

    // Method untuk menampilkan seluruh identitas diri
    public void tampilkanIdentitasDiri() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur() + " tahun");
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Hobi: " + getHobi());
    }

    public static void main(String[] args) {
        // Membuat objek identitasDiri
        jobsheeNo4 identitas = new jobsheeNo4("Rosyid ", 60, "Jl. Rembiga No. 123", "Game");

        // Menampilkan identitas diri
        identitas.tampilkanIdentitasDiri();
    }
}
