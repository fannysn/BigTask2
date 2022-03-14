package Soal2;
import java.util.Scanner;

public class Kapasitas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text,cari,ganti;

        System.out.print("Masukkan teks :  ");
        text=in.nextLine();

        System.out.print("Huruf yang akan diganti :  ");
        cari=in.nextLine();

        System.out.print("Diganti dengan :  ");
        ganti=in.nextLine();

        System.out.print("Hasil find dan replace : "+ text.replace(cari,ganti));
    }
}
