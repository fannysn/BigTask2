package Soal4;

public class ArrayHuruf {
    public static void main (String args[])
    {
        //Deklarasi array tabel Huruf
        String[][]huruf = {
                {"A", "B", "C/K", "D", "E"},
                {"F","G","H","I","J"},
                {"L","M","N","O","P"},
                {"Q","R","S","T","U"},
                {"V","W","X","Y","Z"}
        };
        //Menampilkan hasil output isi array pada indeks ke-[3][1], [2][4], dan [5][3]
        System.out.println(huruf[3][1]);
        System.out.println(huruf[2][4]);
        System.out.println(huruf[5][3]);
    }
}
