package com.example.Java101;
import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1, ekok = 1;
        int kat = 1;
        Scanner x = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = x.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = x.nextInt();

        while (kat <= n1) {
            kat++;
            if (n1 % kat == 0 && n2 % kat == 0) {
                ebob = kat;
            }
        }
        System.out.println("ebob: " + ebob);
        ekok = (n1 * n2) / ebob;
        System.out.println("ekok: " + ekok);
    }
}
