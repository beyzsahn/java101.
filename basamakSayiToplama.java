package com.example.Java101;
import java.util.Scanner;
/*Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    Örnek : 1643 = 1 + 6 + 4 + 3 = 14   */
public class basamakSayiToplama {
        public static void main(String[] args){
            Scanner x = new Scanner(System.in);
            System.out.print("Sayı giriniz: ");
            int sayi=x.nextInt();
            int deger;
            int sonuc=0;
            while(sayi != 0){
                deger=sayi%10;
                sonuc+=deger;
                sayi/=10;
            }
            System.out.println(sonuc);
        }
    }

