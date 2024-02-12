package com.example.Java101;
import java.util.Arrays;
import java.util.Scanner;
public class kullanicidanAlinanDizi {
    public static void main(String[] args){
        int n;
        Scanner x=new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        n=x.nextInt();
        int[] list=new int[n];
        System.out.println("Dizinin elemanlarını giriniz:");
        for(int i=0;i<list.length;i++){
            System.out.print((i+1)+". Elemanı: ");
            list[i]=x.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i != list.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
