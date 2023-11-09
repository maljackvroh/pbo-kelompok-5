package percobaan1;
 class Mobil {
    String merek;
    String model;
    String warna;
    String bahanBakar;
    int harga;

    public void display(String merek, String model, String warna, String bahanBakar, int harga){
        
        System.out.println("\nData Mobil 1:");
        System.out.println("Merek\t\t: "+merek);
        System.out.println("Model\t\t: "+model);
        System.out.println("Warna\t\t: "+warna);
        System.out.println("Bahan Bakar\t: "+bahanBakar);
        System.out.println("harga\t\t: "+harga);
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: " +maxSpeed);
    }
}

public class Percobaan1 {
    public static void main(String[] args) {
        Mobil newMobil = new Mobil();

        newMobil.display("mitsubishi", "truck", "Yellow", "Solar", 600000);
        newMobil.speed(900);
    }
}