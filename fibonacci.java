package com.example.Java101;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci dizisi olsun?: ");
        int k=x.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(+n1+" "+n2);
        for(int i=2;i<=k;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
