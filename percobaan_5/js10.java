package percobaan_5;

public class js10 {
    public static void main(String[] args) {
        data a = new data();

        a.setAngka(5);

        int hasil = 1;
        int n = a.getAngka();

        // Rumus n! = n x (n-1)!
        

        for(int i = 1; i<=n;i++){
            hasil *=i;
        }
        System.out.println("Hasil: "+hasil);
    }
}
