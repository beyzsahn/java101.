package com.example.Java101;
import java.util.Scanner;
public class metotlarHesapMakinesi {
    static int toplama(int a,int b){
        int result=a+b;
        System.out.println("Toplam: "+result);
        return result;
    }
    static int cikarma(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma: "+result);
        return result;
    }
    static int carpma(int a,int b){
        int result=a*b;
        System.out.println("Çarpma: "+result);
        return result;
    }
    static int bolme(int a,int b){
        if(b==0){
            System.out.println("Tanımsız. İkinci sayı 0'dan farklı olmalı.");
        }
        int result=a/b;
        System.out.println("Bölme: "+result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üs alma: "+result);
        return result;
    }
    static int factorial(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Faktöriyel: "+result);
        return result;
    }

    static int mod(int a, int b){
        int result=a%b;
        System.out.println("Mod alma: "+result);
        return result;
    }
    static int dikdortgen(int a, int b){
        int result=1;
        System.out.println("Çevresi: "+(2*(a+b)));
        System.out.println("Alanı: "+(a*b));
        return result;
    }


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int s;
        int a;
        int b;
        String menu ="1-Toplama\n"
                + "2- Çıkarma\n"
                + "3- Çarpma\n"
                + "4- Bölme\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktöriyel\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı";
        System.out.println(menu);
        System.out.print("Bir işlem seçiniz: ");
        s =x.nextInt();
        while(true){
            if(s == 0){
                break;
            }else{
                System.out.print("İlk sayı: ");
                a= x.nextInt();;
                System.out.print("İkinci sayı: ");
                b=x.nextInt();
            }
            switch (s){
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    dikdortgen(a,b);
                    break;
            }
        }

    }
}
