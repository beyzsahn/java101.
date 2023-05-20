package com.example.Java101;
import java.util.Scanner;
//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
public class asalSayi {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        for(int i=2;i<=100;i++){
            int n=0;
            for(int j=2;j<=100;j++){
                if(i%j==0){
                    n++;
                }
            }if(n<2) {
                System.out.print(i+" ");
            }
        }

    }
}
