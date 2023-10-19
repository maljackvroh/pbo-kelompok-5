package percobaan1;
class Mobil {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

    public Mobil (String a, String b, String c, String d, int e){
        merek = a;
        model = b;
        warna = c;
        bahanBakar = d;
        harga = e;
    }
    
    public void display() {
        System.out.println(merek);
        System.out.println(model);
        System.out.println(warna);
        System.out.println(bahanBakar);
        System.out.println(harga);
        
    }

}

class Motor {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

    public Motor (String a, String b, String c, String d, int e){
        merek = a;
        model = b;
        warna = c;
        bahanBakar = d;
        harga = e;
    }
    
    public void display() {
        System.out.println(merek);
        System.out.println(model);
        System.out.println(warna);
        System.out.println(bahanBakar);
        System.out.println(harga);
        
        
    }
}

public class Percobaan1{
    public static void main(String[] args) {
        Mobil mobill = new Mobil("Toyota", "Van", "Black mate", "Pertamax", 123985019);
        Motor motorr = new Motor("Kawasaki", "CB 150", "Black Mamba", "Pertamax Turbo", 50000000);

        mobill.display();
        motorr.display();
    }
}