package com.example.Java101;
import java.util.Scanner;
/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
 toplam tutarını ekrana yazdıran programı yazın.
-Meyveler ve KG Fiyatları-
-Armut : 2,14 TL
-Elma : 3,67 TL
-Domates : 1,11 TL
-Muz: 0,95 TL
-Patlıcan : 5,00 TL
*/
public class ManavKasa {
    public static void main(String[] args){
        int armut,elma,doma,muz,pat;
        double toplam;
        Scanner a=new Scanner(System.in);
        System.out.print("Armut kaç kilo?: ");
        armut=a.nextInt();
        System.out.print("Elma kaç kilo?: ");
        elma=a.nextInt();
        System.out.print("Domates kaç kilo?: ");
        doma=a.nextInt();
        System.out.print("Muz kaç kilo?: ");
        muz=a.nextInt();
        System.out.print("Patlıcan kaç kilo?: ");
        pat=a.nextInt();

        toplam=(armut*2.14+elma*3.67+doma*1.11+muz*0.95+pat*5.00);
        System.out.print("Toplam tutar: "+toplam);
    }
}
