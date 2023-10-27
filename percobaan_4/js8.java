package percobaan_4;

class mtkk{
    // luas persegi
    /*Rumus
        hasil = s*s
    */
    public int math(int sisi){
        int hasil = sisi * sisi;
        return hasil;
    }

    // luas persegi panjang
    /*Rumus
        hasil = p*l
    */
    public int math(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    // luas segitiga
    /*Rumus
        hasil = a*t/2
    */
    public double math(double a, double t){
        double hasil = a * t / 2;
        return hasil;
    }
}
public class js8 {
    public static void main(String[] args) {
        mtkk luas = new mtkk();
        
        System.out.println("Persegi "+luas.math(3));
        System.out.println("Persegi panjnag "+luas.math(4, 6));
        System.out.println("Segitiga "+luas.math(2d, 4d));
    }    
}
