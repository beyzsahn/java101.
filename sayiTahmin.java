package com.example.Java101;
import java.awt.print.PrinterGraphics;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class sayiTahmin {
    public static void main(String[] args){
        Random rand=new Random();
        int number = rand.nextInt(100);

        Scanner x=new Scanner(System.in);
        int hak=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        System.out.println(number);
        while(hak<5){
            System.out.print("Tahmininiz: ");
            selected=x.nextInt();
            if (selected<0 || selected>99) {
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                continue;
            }
            if(selected==number){
                System.out.println("Tebrikler,doğru. Tahmin ettiğin sayı: "+number);
                isWin=true;
                break;
            } else{
                System.out.println("Hatalı bir sayı girdiniz.");
                if(selected>number){
                    System.out.println(selected+" sayısı, gizli sayıdan büyük.");
                }else{
                    System.out.println(selected+" sayısı, gizli sayıdan küçük.");
                }

                wrong[hak++]=selected;
                System.out.println("Kalan hak: "+(5-hak));

            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz.");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
        }

    }
}
