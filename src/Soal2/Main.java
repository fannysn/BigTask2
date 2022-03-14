package Soal2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void convertVocal(String taps) {

        char[] vocal = {'a', 'i', 'u', 'e', 'A', 'I', 'U', 'E'};
        char[] o = {'o', 'O'};
        int panjang = taps.length();
        List<Character> vokal = new LinkedList<>();
        List<Character> oList = new LinkedList<>();
        String newVocal = "";
        for (int i : vocal) {
            vokal.add((char) i);
        }
        for (int i : o) {
            oList.add((char) i);
        }

        for (int i = 0; i < panjang; i++) {
            char n = taps.charAt(i);
            if (vokal.contains(n)) {
                char z = '.';
                newVocal = newVocal + z;
            }
            else if (oList.contains(n)) {
                char z = '-';
                newVocal = newVocal + z;
            }
        }

        System.out.println("All vocal: " + newVocal);
    }

    public static void main(String[] args) {
        convertVocal("SAMPO");
        convertVocal("robot");
        convertVocal("kapasitas");
        convertVocal("sOekArno");
    }
}
