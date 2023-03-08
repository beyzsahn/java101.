package com.example.Java101;
import java.util.Scanner;
/*
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
public class DaireAlanCevre {
    public static void main(String[] args){
        int r,𝛼;
        double pi=3.14,alan;

        Scanner a=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r=a.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        𝛼=a.nextInt();
        alan=(pi*r*r*𝛼)/360;
        System.out.println("Daire diliminin alanı?: "+alan);

    }
}
