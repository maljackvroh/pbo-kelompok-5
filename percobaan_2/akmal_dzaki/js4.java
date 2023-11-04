package percobaan_2.akmal_dzaki;

class Data_diri {
    String nama;
    int umur;
    String alamat;
    String hoby;

    void display1(){
        System.out.println("\nNama\t: "+nama);
    }
    void display2(){
        System.out.println("Umur\t: "+umur);
    }
    void display3(){
        System.out.println("Alamat\t: "+alamat);
    }
    void display4(){
        System.out.println("Hoby\t: "+hoby);
    }
}

public class js4 {
    public static void main(String[] args) {
        Data_diri bio = new Data_diri();

        bio.nama = "Akmal Dzaki";
        bio.umur = 21;
        bio.alamat = "Jln Melur No 1.A";
        bio.hoby = "Browsing";

        bio.display1();
        bio.display2();
        bio.display3();
        bio.display4();
    }
}
