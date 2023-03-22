package com.example.Java101;
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args){
        String userName,password;
        Scanner x=new Scanner(System.in);
        int hak=3;
        int secim;
        int hesap=1500;
        int miktar;
        while(hak>0){
            System.out.print("Kullanıcı adınız: ");
            userName=x.nextLine();
            System.out.print("Parolanız: ");
            password=x.nextLine();
            if(userName.equals("beyza")&&password.equals("sahin07")){
                System.out.println("Güvenli giriş yaptınız!");
                do{
                    System.out.println("1-Para Yatırma \n 2-Para Çekme \n 3-Bakiye Sorgulama \n 4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim=x.nextInt();
                    switch(secim) {
                        case 1:
                            System.out.print("Para Miktarı: ");
                            miktar=x.nextInt();
                            hesap+=miktar;
                            System.out.println("Güncel Bakiyeniz: "+hesap);
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            miktar=x.nextInt();
                            if(miktar>hesap){
                                System.out.println("Bakiye yetersiz.");
                            }else{
                                hesap-=miktar;
                                System.out.println("Güncel Bakiyeniz: "+hesap);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+hesap);
                            break;
                    }
                }while(secim!=4);
                System.out.println("Görüşmek üzere!");
                break;
            }else{
                --hak;
                System.out.println("Hatalı şifre veya kullanıcı adı. Tekrar deneyiniz.");
                if(hak==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else {
                    System.out.println("Kalan hakkınız: " + hak);
                }
            }
        }

    }
}
