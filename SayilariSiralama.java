package com.example.Java101;
import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args){
        int a,b,c;
        Scanner x=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        a=x.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b=x.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        c=x.nextInt();
        if(a<b && a<c){
            if(b<c) System.out.print("a<b<c");
            else System.out.println("a<c<b");
        }
        else if(b<a && b<c) {
            if(a<c) System.out.println("b<a<c");
            else System.out.println("b<c<a");
        }
        else {
            if(a<b) System.out.println("c<a<b");
            else System.out.println("c<b<a");
        }

    }
}
