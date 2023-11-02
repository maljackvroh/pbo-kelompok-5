package percobaan_4;

class hewan{
    String nama;
    char jenisK;
    int kaki;
    float panjang;
    boolean isMamalia;


    hewan(String nama){
        this.nama = nama;
    }
    hewan(char jenisK){
        this.jenisK = jenisK;
    }
    hewan(int kaki){
        this.kaki = kaki;
    }
    hewan(float panjang){
        this.panjang = panjang;
    }
    hewan(boolean inMamalia){
        this.isMamalia = isMamalia;
    }
}

public class responAC {
    public static void main(String[] args) {
        hewan hwnNama = new hewan("jerapah");
        hewan hwnJenis = new hewan('L');
        hewan hwnKaki = new hewan(4);
        hewan hwnPnjg = new hewan(123.4f);
        hewan hwn = new hewan(true);

        System.out.println("\nNama hewan itu "+hwnNama.nama);
        System.out.println("Jenis kelamin hewan itu "+hwnJenis.jenisK);
        System.out.println("Hewan itu berkaki "+hwnKaki.kaki);
        System.out.println("Dengan panjang "+hwnPnjg.panjang);
        System.out.println("Apakah hewan itu mamalia?"+hwn.isMamalia);
    }
}
