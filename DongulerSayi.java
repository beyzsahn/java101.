package com.example.Java101;
import java.util.Scanner;
/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
public class DongulerSayi {
    public static void main(String[] args){
        int sayi;
        int toplam=0;
        Scanner x=new Scanner(System.in);
        do{
            System.out.print("Sayı giriniz: ");
            sayi=x.nextInt();
            if((sayi%2==0) && (sayi%4==0)){
                toplam+=sayi;
            }
        }while(sayi%2 == 0);
        System.out.println("Toplam: "+toplam);
    }
}
