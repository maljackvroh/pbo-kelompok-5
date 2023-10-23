// Buatlah program (bebas) method dengan Setter dan Getter dengan contoh dan Latihan yang telah di buat
package percobaan_2;

import java.util.Scanner;

class Mahasiswa{
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
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setIpk(3.43);
        System.out.println("Ipk saya: " + mhs.getIpk());
    }
}
