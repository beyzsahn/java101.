package com.example.Java101;
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args){
        int taban,ust;
        int total=1;
        Scanner x=new Scanner(System.in);
        System.out.print("Taban deger: ");
        taban=x.nextInt();
        System.out.print("Üs deger: ");
        ust=x.nextInt();
        for(int i=1;i<=ust;i++){
            total*=taban;
        }
        System.out.println("Cevap: "+total);
    }
}
