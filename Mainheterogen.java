package Latihan;

public class Mainheterogen {
    public static void main(String[] args) {
    Karyawan[] roster = new Karyawan[10];

    roster[0] = new KaryawanKontrak(1, "Budi", 2, 500000.0, 20);
    roster[1] = new KaryawanTetap(2, "Susi", 1, 1000000.0);
    roster[2] = new KaryawanTetap(3, "Ani", 0, 800000.0);
    for(Karyawan karyawan : roster){
        if (karyawan instanceof KaryawanKontrak) {
            KaryawanKontrak kontrak = (KaryawanKontrak) karyawan;
            System.out.println("Karyawan Kontrak: " + kontrak.nama + ", Upah Total: " + kontrak.hitungUpahTotal());
        } else if (karyawan instanceof KaryawanTetap) {
            KaryawanTetap tetap = (KaryawanTetap) karyawan;
            System.out.println("Karyawan Tetap: " + tetap.nama + ", Gaji Total: " + tetap.hitungGajiTotal());
        }
    }
    }

    }



