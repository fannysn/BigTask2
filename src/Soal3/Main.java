package Soal3;

public class Main {

    public static void main(String[] args) {

        Mobil trek=new Mobil();
        trek.kapasitasMax=200;

        Hewan ayam=new Hewan();
        Hewan ayam2=new Hewan();

        Hewan singa=new Hewan();
        Hewan singa2=new Hewan();
        Hewan singa3=new Hewan();

        ayam.namaHewan="chick";
        ayam2.namaHewan="petok";
        singa.namaHewan="lion";

        ayam.berat=150;
        ayam2.berat=200;
        singa.berat=65;
        singa2.berat=75;
        singa3.berat=85;

        Mobil.tambahMuatan(ayam);
        Mobil.tambahMuatan(ayam2);
        Mobil.tambahMuatan(singa3);
        Mobil.daftarMuatan();
    }
}
