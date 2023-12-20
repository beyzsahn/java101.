package com.example.Java101;
import java.util.Scanner;
public class recursiveAsalSayi {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        System.out.println("bir sayı gir: ");
        int sayi=x.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
        else {
            if (asalMi(sayi, sayi / 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }

    }
    public static boolean asalMi(int sayi, int bolen) {
        if(sayi<2){
            return false;
        }
        if (bolen==1){
            return true;
        }
        if(sayi%bolen==0){
            return false;
        }else{
            return asalMi(sayi,bolen-1);
        }
    }
}
