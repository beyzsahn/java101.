package com.example.Java101;
//Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
import java.util.Scanner;
public class yildizlarTersUcgen {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int basSayi=x.nextInt();
        for(int i=basSayi;i>0;i--){
            for(int k=basSayi-i;k>0;k--) {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
