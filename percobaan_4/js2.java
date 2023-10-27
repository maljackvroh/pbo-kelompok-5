package percobaan_4;
class mth{
    // tambah
    int math(int a, int b){
        int hasil = a + b;
        return hasil;
    }

    // kurang
    float math(float a, float b){
        float hasil = a - b;
        return hasil;
    }

    // kali
    double math(double a, double b){
        double hasil = a * b;
        return hasil;
    }
}
public class js2 {
    public static void main(String[] args) {
        mth math = new mth();
        
        System.out.println("Tambah "+math.math(3, 5));
        System.out.println("Kurang "+math.math(10f, 5f));
        System.out.println("Kali "+math.math(5d, 5d));
    }    
}
