    // Buatlah program (bebas) method dengan Setter dan Getter dengan contoh dan Latihan yang telah di buat
    package percobaan_2;

    class Mahasiswa{
        String nama;
        String nim;
        private double ipk;
        
        // Getter
        public double getIpk(){
            return ipk;
        }

        // Setter
        public void setIpk(double newIpk){
            this.ipk = newIpk;
        }
    }


    public class skpribadi {
        public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa();

            mhs.setIpk(3.43);
            System.out.println("Ipk saya: " + mhs.getIpk());
        }
    }
