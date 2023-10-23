// program sederhana dengan 2 buah method untuk menampilkan nama-nama hewan karnivora dan herbivora pada bahasa Java:
public class JobsheetNo2 {

    public void Herbivora() {
        String[] Hewanherbivora = { "Landak", "badak", "Siput", "kambing", "Ayam" };
        System.out.println("~Hewan Herbivora ~");
        for (int i = 0; i < Hewanherbivora.length; i++) {
            System.out.println((i + 1) + ") " + Hewanherbivora[i]);
        }
        System.out.println("");

    }

    public void Karnivor() {
        String[] HewanKarnivor = { "singa", "harimau", "serigala", "jaguar" };
        System.out.println("~Hewan Herbivora ~");
        for (int i = 0; i < HewanKarnivor.length; i++) {
            System.out.println((i + 1) + ") " + HewanKarnivor[i]);
        }
    }

    public static void main(String[] args) {
        JobsheetNo2 a = new JobsheetNo2();
        a.Herbivora();
        a.Karnivor();
    }
}