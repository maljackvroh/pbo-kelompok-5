import java.util.Scanner;

class Hitung {
    int sisiAlas;
    int tinggi;
    int volume;

    public void Htung() {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Volume Limas Segi Empat ");
        System.out.println(" ");
        System.out.print("Panjang sisi alas limas : ");
        sisiAlas = in.nextInt();
        System.out.print("tinggi limas            : ");
        tinggi = in.nextInt();
    }

    public int hasil() {
        volume = (int) ((1.0 / 3.0) * sisiAlas * sisiAlas * tinggi);
        return volume;
    }

    public void display() {
        hasil();
        System.out.println("volume dari limas adalah : " + volume);
    }
}

public class jobsheetNo5 {
    public static void main(String[] args) {
        Hitung a = new Hitung();
        a.Htung();
        a.display();
    }
}