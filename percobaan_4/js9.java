package percobaan_4;

class bbio{
    public void data(String nama){
        System.out.println("\nNama saya "+nama);
    }

    public int data(int usia){
        System.out.println("Usia saya "+usia);
        return usia;
    }

    public void data(String hoby,String hobby){
        System.out.println("Hobby saya "+hoby);
        System.out.println("dan terkadang "+hobby);
    }

    public float data(float tinggi){
        System.out.println("Tinggi saya: "+tinggi);
        return tinggi;
    }
}
public class js9 {
    public static void main(String[] args) {
        bbio data = new bbio();

        data.data("Jack");
        data.data(21);
        data.data("Browsing", "Adventure");
        data.data(167f);
    }
}
