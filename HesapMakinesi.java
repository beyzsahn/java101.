package com.example.Java101;
import java.util.Scanner;
//Switch case ile basit hesap makinesi yapma
public class HesapMakinesi {
    public static void main(String[] args){
        int n1,n2,select;
        Scanner x=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1=x.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=x.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select=x.nextInt();

        switch(select){
            case 1:
                System.out.print("Toplamı: "+(n1+n2));
                break;
            case 2:
                System.out.print("Farkı: "+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpımı: "+(n1*n2));
                break;
            case 4:
                switch(n2) {
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.print("Bölümü: " + (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.print("Yanlış seçim yaptınız.");
                break;
        }
    }
}
