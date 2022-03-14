package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d,e,f,g=0;

        try {
            System.out.println("Masukkan nilai = ");
            int h = Integer.parseInt(input.readLine());
            for (a = 0; a <=(h-1); a++) {
                for (b = 1; b <= a; b++) {
                    System.out.print(" ");
                }
                for (c = 0; c >=(a-h+1); c--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

            for (f =0; f <h; f++) {
                for (d = 1; d < h-f; d++) {
                    System.out.print(" ");
                }
                for (e = 0; e <(f+1); e++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } catch (Exception i) {
            System.out.println("Terjadi Kesalahan" +i.getMessage());
        }
    }
}
