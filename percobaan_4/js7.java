package percobaan_4;

class rumus{
    int hasilPersegi;
    int hasilPanjang;
    double hasilSegitiga;

    public rumus(int x){
        hasilPersegi = x*x;
        
    }

    public rumus(int x, int y){
        hasilPanjang = x*y;
    }

    public rumus(double x, double y){
        hasilSegitiga = x*y/2;
    }
}

public class js7 {
    public static void main(String[] args) {
        rumus rms = new rumus(10);
        rumus rms2 = new rumus(4, 5);
        rumus rms3 = new rumus(8d, 7d);

        System.out.println("Persegi "+rms.hasilPersegi);
        System.out.println("Persegi panjang "+rms2.hasilPanjang);
        System.out.println("Segitiga "+rms3.hasilSegitiga);
    }
}
