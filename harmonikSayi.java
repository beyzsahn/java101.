package com.example.Java101;
import java.util.Scanner;
public class harmonikSayi {
    public static void main(String[] args){
        double sonuc=0.0;
        Scanner x=new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n=x.nextInt();
        for(int i=1;i<=n;i++){
            sonuc+=1.0/i;
        }
        System.out.println("Sonuç: "+sonuc);
    }
}
