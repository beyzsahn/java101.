package com.example.Java101;
import java.util.Scanner;
public class recursiveUslüSayi {
    static int isPower(int a, int b){
        if(b==0){
            return 1;
        }else{
            return a*isPower(a,b-1);
        }
    }
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.print("Taban değeri giriniz: ");
            a = x.nextInt();
            System.out.print("Üs değeri giriniz: ");
            b = x.nextInt();
            System.out.println(isPower(a, b));
        }while((a>=0)&&(b>=0));
    }
}
