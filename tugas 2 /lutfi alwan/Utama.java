class Hitung {
    int sisiAlas;
    int tinggi;
    int volume;

    public Hitung(int ss, int t) {
        sisiAlas = ss;
        tinggi = t;
    }

    public int hasil() {
        volume = (int) ((1.0 / 3.0) * sisiAlas * sisiAlas *
                tinggi);
        return volume;
    }

    public void display() {
        System.out.println("~Program Volume Limas Segi Empat~ ");
        System.out.println("");
        System.out.println("Panjang sisi alas limas : " + sisiAlas);
        System.out.println("tinggi limas : " + tinggi);
        hasil();
        System.out.println("volume dari limas adalah : " + volume);
    }
}

public class Utama {
    public static void main(String[] args) {
        Hitung a = new Hitung(12, 23);
        a.display();
    }
}
