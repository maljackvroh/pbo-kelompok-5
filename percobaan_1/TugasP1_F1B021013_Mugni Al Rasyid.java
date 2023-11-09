package tugasp1;
import java.util.Scanner;

public class TUGASP1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan suhu (dalam Celsius): ");
        double suhuCelsius = scanner.nextDouble();
        
        Double suhuFahrenheit = (suhuCelsius * 9/5 ) + 32;
        System.out.println("Suhu dalam Fahrenheit : " + suhuFahrenheit + "F");
        
        double suhuCelsiusKembali = (suhuFahrenheit - 32) * 5/9;
        System.out.println(" Suhu kembali dalam Celsius : " + suhuCelsiusKembali + "C");
        
        scanner.close();
    }
    
}
