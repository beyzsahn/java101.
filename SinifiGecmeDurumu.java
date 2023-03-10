package com.example.Java101;
import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args){
        int mat,turkce,fizik,kimya,muzik;
        double avarage;
        int toplam=0,ders=0;
        Scanner x= new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat=x.nextInt();
        if(100>=mat&&mat>=0){
            toplam+=mat;
            ders++;
        }
        System.out.print("Türkçe notu: ");
        turkce=x.nextInt();
        if(100>=turkce&&turkce>=0){
            toplam+=turkce;
            ders++;
        }
        System.out.print("Fizik notu: ");
        fizik=x.nextInt();
        if(100>=fizik&&fizik>=0){
            toplam+=fizik;
            ders++;
        }
        System.out.print("Kimya notu: ");
        kimya=x.nextInt();
        if(100>=kimya&&kimya>=0){
            toplam+=kimya;
            ders++;
        }
        System.out.print("Müzik notu: ");
        muzik=x.nextInt();
        if(100>=muzik&&muzik>=0){
            toplam+=muzik;
            ders++;
        }
        avarage=toplam/ders;
        if(avarage>=55){
            System.out.println("Sınıfı geçtiniz, tebrikler. ");
        }
        else{
            System.out.println("Sınıfta kaldınız. ");
        }
        System.out.print("Ortalamanız: "+avarage);

    }
}
