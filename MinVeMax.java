package com.example.Java101;
import java.util.Scanner;
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
public class MinVeMax {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n;
        int sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("Kaç sayı giriceksiniz?: ");
        n=x.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = x.nextInt();
            if(sayi>max) max=sayi;
            else if(sayi<min) min=sayi;
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);
    }
}
