package com.example.Java101;
import java.util.Scanner;
/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
 sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
  değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.*/
public class mukemmelSayi {
    public static void main(String[] args){
        int sonuc=0;
        Scanner x=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=x.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0) {
                System.out.println(i);
                sonuc+=i;
            }
        }
        if(sonuc==sayi){
            System.out.println("Mükemmel sayıdır.");
        }
        else System.out.println("Mükemmel sayı değildir.");
    }
}
