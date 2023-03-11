package com.example.Java101;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args){
        int yil;
        Scanner x=new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil=x.nextInt();
        if(yil%400==0){
            System.out.println(+yil+" Artık yıl.");
        }
        else if(yil%100!=0 && yil%4==0){
            System.out.println(+yil+" Artık yıl.");
        }
        else{
            System.out.println(+yil+" Artık yıl değil.");
        }
    }
}
