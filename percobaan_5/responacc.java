package percobaan_5;

import java.util.Scanner;

class trap {
    float atas;
    float bawah;
    float tinggi;

    public void setTrap(float atas, float tinggi, float bawah){
        this.tinggi = tinggi;
        this.atas = atas;
        this.bawah = bawah;
    }

    float getTrap(){
        float hasil = (atas+bawah)*tinggi/2;
        return hasil;
    }

}


public class responacc{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan nilai atas: ");
        float a = in.nextFloat();

        System.out.print("Masukan nilai bawah: ");
        float b = in.nextFloat();

        System.out.print("Masukan nilai tinggi: ");
        float t = in.nextFloat();

        trap obj = new trap();

        obj.setTrap(a, t, b);
        System.out.println("Hasil : "+obj.getTrap());
    }
}