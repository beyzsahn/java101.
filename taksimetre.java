package com.example.Java101;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double kmBasina=2.20;
        int km;
        int taksiAcilis=10;
        double tutar;


        Scanner x=new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden gir:");
        km=x.nextInt();

        tutar=(km*kmBasina);
        tutar+=taksiAcilis;
        if(tutar<20){
            tutar=20;
        }
        System.out.println(tutar);


    }
}
