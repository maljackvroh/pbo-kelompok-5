package percobaan_7;

import java.util.Random;

class Kendaraan {
    public int biayaPerbaikan() {
        return 0;
    }
}

class Mobil extends Kendaraan {
    @Override
    public int biayaPerbaikan() {
        return 500000;
    }
}

class Truk extends Kendaraan {
    @Override
    public int biayaPerbaikan() {
        return 1000000;
    }
}

class Motor extends Kendaraan {
    @Override
    public int biayaPerbaikan() {
        return 300000;
    }
}

class std_kasus {
    private static final Random random = new Random();

    public static void main(String[] args) {
        String[] Nama_Kendaraan = { "Mobil", "Motor", "Truck" };
        Kendaraan[] kendaraan = new Kendaraan[10];

        for (int i = 0; i < kendaraan.length; i++) {
            int jenisKendaraan = random.nextInt(3);
            String nmKendaraan = Nama_Kendaraan[jenisKendaraan];
            switch (jenisKendaraan) {
                case 0:
                    kendaraan[i] = new Mobil();
                    break;
                case 1:
                    kendaraan[i] = new Truk();
                    break;
                case 2:
                    kendaraan[i] = new Motor();
                    break;
            }
            System.out.println("=> 1 " + nmKendaraan + " telah diperbaiki");

        }

        int totalPenghasilan = 0;
        for (Kendaraan k : kendaraan) {
            totalPenghasilan += k.biayaPerbaikan();
        }

        System.out.println("Penghasilan Bengkel: Rp " + totalPenghasilan);
    }
}