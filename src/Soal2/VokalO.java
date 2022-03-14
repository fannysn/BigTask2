package Soal2;

import java.util.Locale;
import java.util.Scanner;

public class VokalO {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] ch = new char [str.length()];
        for (int i=0;i<str.length();i++) {
            ch[i] = str.toLowerCase().charAt(i);
        }
        for (int x=0;x<str.length();x++) {
            if (ch[x] == 'a' || ch[x] == 'i' || ch[x] == 'u' || ch[x] == 'e') {
                System.out.print('.');
            }
            else if (ch[x] == '0') {
                System.out.print('-');
            }
        }
    }
}
