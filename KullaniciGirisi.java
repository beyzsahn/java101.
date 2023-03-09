package com.example.Java101;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args){
        String userName,password,password2;
        int select;
        Scanner x=new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName=x.nextLine();
        System.out.print("Şifreniz: ");
        password=x.nextLine();
        if(userName.equals("patika")&&password.equals("1234")){
            System.out.print("Başarılı şekilde giriş yaptınız.");
        }
        else{
            System.out.println("Şifre yanlış.");
            System.out.println("Şifreyi sıfırlamak istiyorsanız 1'e, sıfırlamak istemiyorsanız 2'yi tuşlayınız.");
            select=x.nextInt();
            switch(select){
                case 1:
                    Scanner a=new Scanner(System.in);
                    System.out.print("Yeni şifre giriniz: ");
                    password2=a.nextLine();
                    if(password2.equals(password)){
                        System.out.println("Yeni şifreniz eski şifre ile aynıdır. Tekrar deneyiniz.");
                    }
                    else{
                        System.out.println("Şifreniz başarıyla değiştirilmiştir.");
                    }
                    break;
                case 2:
                    System.out.print("İşlem bitmiştir.");
                    break;
                default:
                    System.out.print("Lütfen geçerli şifre giriniz.");
                    break;
            }
        }
    }
}
