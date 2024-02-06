package com.example.Java101;
import java.util.Scanner;
public class deseneGöreMetot {
    public static void islemYap(int sayi) {
        System.out.print(sayi + " ");
        if (sayi <= 0)
        {
            return;
        }
        if (sayi > 0)
        {
            islemYap(sayi - 5);
            System.out.print(sayi + " ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        islemYap(n);
    }

}
