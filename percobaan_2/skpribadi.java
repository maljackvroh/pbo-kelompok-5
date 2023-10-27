// Buatlah program (bebas) method dengan Setter dan Getter dengan contoh dan Latihan yang telah di buat
package percobaan_2;

import java.util.Scanner;

//buat class objek
class Mahasiswa{
    //atribut
    String nama;
    String nim;
    private double ipk;
    
    // Setter
    public void setIpk(double newIpk){
       this.ipk = newIpk;
    }

    // Getter
    public double getIpk(){
        return ipk;
    }
}


public class skpribadi {
    //main function
    public static void main(String[] args) {
        //deklarasi objek mhs :: objek
        Mahasiswa mhs = new Mahasiswa();

        //masukin nilai pake set ke objek mhs
        mhs.setIpk(3.43);

        //menampilkan nilai ipk pake get dr objek mhs
        System.out.println("Ipk saya: " + mhs.getIpk());
    }
}
