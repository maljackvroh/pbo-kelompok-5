    package percobaan_2;

    class Mahasiswa{
        String nama;
        String nim;
        private double ipk;
        
        // Getter
        public double getIpk(){
            return ipk;
        }

        public void setIpk(double newIpk){
            this.ipk = newIpk;
        }
    }


    public class skpribadi {
        public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa();

            mhs.setIpk(3.43);
            System.out.println(mhs.getIpk());
        }
    }
