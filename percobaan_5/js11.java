package percobaan_5;

import java.util.Scanner;

public class js11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        data b = new data();

        System.out.println("\nMasukan nilai yang ingin dicek: ");
        b.setAngka(inp.nextInt());

        int hasil = 1;
        int n = b.getAngka();
        // Rumus n! = n x (n-1)!
        

        for(int i = 1; i<=n;i++){
            hasil *=i;
        }
        System.out.println("\nHasil: "+hasil);
    }    
}
