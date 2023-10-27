package percobaan_4;

class orang{
    public void diri(String nama){
        System.out.println("\nNama dia "+nama);
    }

    public int diri(int usia){
        System.out.println("Usia dia "+usia);
        return usia;
    }

    public void diri(String hoby,String hobby){
        System.out.println("Hobby dia "+hoby);
        System.out.println("dan terkadang "+hobby);
    }

    public float diri(float tinggi){
        System.out.println("Tinggi dia: "+tinggi);
        return tinggi;
    }
}
public class js4 {
    public static void main(String[] args) {
        orang diri = new orang();

        diri.diri("Jack");
        diri.diri(21);
        diri.diri("Browsing", "Adventure");
        diri.diri(167f);
    }
}
