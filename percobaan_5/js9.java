package percobaan_5;

public class js9 {
    public static void main(String[] args) {
        animal a = new animal();

        a.getNama();
        System.out.println("\nNama sebelumnya: "+a.getNama());
        a.setNama("Hari-mau");
        System.out.println("Nama sesudahnya: "+a.getNama());
        a.getTipe();
        System.out.println("\nTipe sebelumnya: "+a.getTipe());
        a.setTipe("Karnivora");
        System.out.println("Tipe sesudahnya: "+a.getTipe());
        a.getJmlKaki();
        System.out.println("\nJmlKaki sebelumnya: "+a.getJmlKaki());
        a.setJmlKaki(4);
        System.out.println("JmlKaki sesudahnya: "+a.getJmlKaki());
    }
}
