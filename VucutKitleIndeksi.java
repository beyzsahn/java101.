package com.example.Java101;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args){
        int kilo;
        double boy,indeks;
        Scanner a=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=a.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=a.nextInt();
        indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+indeks);
    }
}
