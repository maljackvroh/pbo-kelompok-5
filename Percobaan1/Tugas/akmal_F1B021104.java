package Percobaan1.Tugas;
import java.util.Scanner;

class data {
    int numeric;

    // void palindrom(){
    //     if(numeric % 1 != 0){
    //         System.out.println("ini bukan bilangan palindrom");
    //     }
    // }
}

public class akmal_F1B021104 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        data nomor = new data();

        System.out.println("\nIni adalah program pengecekan palindrom angka!!");

        System.out.println("Masukan nilai yang ingin anda cek: ");
        nomor.numeric = obj.nextInt();

    }
    
}
