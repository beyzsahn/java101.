package com.example.Java101;
//döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yaz
import java.util.Scanner;
public class SayilarinKuvvetleri {
    public static void main(String[] args){
        int k;
        Scanner x=new Scanner(System.in);
        System.out.print("Sınır sayısı giriniz: ");
        k=x.nextInt();
        System.out.println("i \t j");
        for(int i=1,j=1;i<=k && j<=k;i*=4, j*=5){
            System.out.println(i+"\t"+j);
        }
    }
}
