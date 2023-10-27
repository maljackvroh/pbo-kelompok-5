package percobaan_4;

class bioo{
    public void data(String nama){
        System.out.println("Nama saya "+nama);
    }

    public int data(int usia){
        System.out.println("Usia saya "+usia);
        return usia;
    }

    public float data(float tinggi){
        System.out.println("Tinggi saya: "+tinggi);
        return tinggi;
    }
}
public class js5 {
    public static void main(String[] args) {
        bioo data = new bioo();

        data.data("Jack");
        data.data(21);
        data.data(167f);
    }
}
