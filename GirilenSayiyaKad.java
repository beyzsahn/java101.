package com.example.Java101;
import java.util.Scanner;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class GirilenSayiyaKad {
    public static void main(String[] args){
        int k,toplam=0,sayac=0;
        double ort;
        Scanner x=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=x.nextInt();
        for(int i=0;i<=k;i++){
            if((i%3==0) && (i%4==0)) {
                sayac+=1;
                toplam+=i;
            }
        }
        ort=toplam/sayac;
        System.out.println("Ortlamaları: "+ort);
    }
}
