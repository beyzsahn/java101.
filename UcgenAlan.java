package com.example.Java101;
import java.util.Scanner;
/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
public class UcgenAlan {
    public static void main(String[] args){
        int a,b,c;
        double alan,u;
        Scanner x=new Scanner(System.in);
        System.out.print("ilk kenar: ");
        a=x.nextInt();
        System.out.print("ikinci kenar: ");
        b=x.nextInt();
        System.out.print("üçüncü kenar: ");
        c=x.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı: "+alan);
    }
}
