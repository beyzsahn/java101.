package com.example.Java101;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args){
        int km,yas,yolculuktipi;
        double kmBasina=0.10,tutar;
        double yasIndirimi,yonIndirimi;
        Scanner x=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km=x.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=x.nextInt();
        System.out.print("Yolculuk tipini tuşlayınız(1->Tek Yön, 2->Gidiş-Dönüş): ");
        yolculuktipi=x.nextInt();

        tutar=km*kmBasina;
        if(km>0 && yas>0) {
            if (yas < 12) {
                yasIndirimi = tutar * 0.5;
                tutar -= yasIndirimi;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = tutar * 0.1;
                tutar -= yasIndirimi;
            } else if (yas >= 65) {
                yasIndirimi = tutar * 0.3;
                tutar -= yasIndirimi;
            }

            switch (yolculuktipi) {
                case 1:
                    System.out.println("Toplam tutar: " + tutar + " TL");
                    break;
                case 2:
                    yonIndirimi = tutar * 0.2;
                    tutar =(tutar-yonIndirimi)*2;
                    System.out.println("Toplam tutar: " + tutar + " TL");
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz.");
                    break;
            }
        }
        else{
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}
