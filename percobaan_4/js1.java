package percobaan_4;
class bio{
    String nama;
    int umur;
    char jenisKelamin;


    public String diri(String nama){
        return nama;
    }

    public int diri(int umur){
        return umur;
    }

    public char diri(char jenisKelamin){
        return jenisKelamin;
    }
}
public class js1 {
    public static void main(String[] args) {
        bio biodata = new bio();

        System.out.println("Nama saya " + biodata.diri("Jack"));
        System.out.println("Umur saya " + biodata.diri(21));
        System.out.println("Jenis kelamin saya " + biodata.diri("L"));
    }
}
