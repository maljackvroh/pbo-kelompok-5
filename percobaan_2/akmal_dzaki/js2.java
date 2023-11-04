package percobaan_2.akmal_dzaki;

class Hewan {
    String[] karnivora = {"Macan","Singa","Buaya"};
    String[] herbivora = {"Gajah","kambing","Jerapah"};
    int bnyakData;

    void display1(){
        System.out.println("\nMacam macam hewan karnivora: ");
        for(int i = 0; i < karnivora.length; i++){
            System.out.println(i+". "+karnivora[i]);
        }
    }

    void display2(){
        System.out.println("\nMacam macam hewan herbivora: ");
        for(int i = 0; i < herbivora.length; i++){
            System.out.println(i+". "+herbivora[i]);
        }
    }
    
}

public class js2 {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
   

        hewan.display1();
        hewan.display2();
    }
}
